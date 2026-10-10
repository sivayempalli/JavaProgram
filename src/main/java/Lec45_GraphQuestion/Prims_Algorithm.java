package Lec45_GraphQuestion;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims_Algorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Prims_Algorithm(int v) {
        // TODO Auto-generated constructor stub
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }

    public void PrimsALgo() {

        //PriorityQueue<PrimPair> pq = new PriorityQueue<>( (a,b) -> { return a.cost - b.cost ; });

        PriorityQueue<PrimPair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        HashSet<Integer> visited = new HashSet<>();

        int sum = 0;

        pq.add(new PrimPair(1,1,0));

        while (!pq.isEmpty()){

            PrimPair pp = pq.poll();

            if(visited.contains(pp.vtx)){
                continue;
            }

            visited.add(pp.vtx);

            sum = sum + pp.cost;

            for(int neigh : map.get(pp.vtx).keySet()){
                if(!visited.contains(neigh)){
                    pq.add(new PrimPair(neigh, pp.vtx, map.get(pp.vtx).get(neigh)));
                }
            }
        }

        System.out.println(sum);

    }

    class PrimPair {
        int vtx;
        int acqVtx;
        int cost;

        PrimPair(int vtx, int acqVtx, int cost){
            this.vtx = vtx;
            this.acqVtx = vtx;
            this.cost = cost;
        }
    }
}
