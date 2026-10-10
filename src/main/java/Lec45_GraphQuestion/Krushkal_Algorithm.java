package Lec45_GraphQuestion;

import java.util.*;

public class Krushkal_Algorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;
    DisJointSet disJointSet = new DisJointSet();

    public Krushkal_Algorithm(int v) {
        // TODO Auto-generated constructor stub
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
            disJointSet.createSet(i);
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }

    public void KrushkalALgo(){
        List<EdgePair> ll = allEdges();
        ll.sort(Comparator.comparing(a -> a.cost));
        int sum= 0;

        for(EdgePair ep : ll){

            int v1 = ep.e1;
            int v2 = ep.e2;
            int p1 = disJointSet.find(v1);
            int p2 = disJointSet.find(v2);

            if(p1 != p2){
                disJointSet.union(v1, v2);
                sum += ep.cost;
            }

        }
    }


    public List<EdgePair> allEdges(){

        List<EdgePair> ll = new ArrayList<>();
        for(int v1: map.keySet()){
            for(int v2 : map.keySet()){
                ll.add(new EdgePair(v1, v2, map.get(v1).get(v2)));
            }
        }
        return ll;
    }

    class EdgePair {
        int e1;
        int e2;
        int cost;

        public EdgePair(int e1, int e2, int cost) {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }
    }
}
