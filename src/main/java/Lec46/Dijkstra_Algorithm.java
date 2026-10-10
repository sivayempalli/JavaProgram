package Lec46;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algorithm {

    private HashMap< Integer , HashMap<Integer, Integer> > map = new HashMap<>();

    Dijkstra_Algorithm(int numberOfVertices){
        for(int i=0;i<numberOfVertices;i++){
            map.put(i , new HashMap<>());
        }
    }

    public void addEdges(int v1, int v2, int cost){
        map.get(v1).put(v1,cost);
        map.get(v2).put(v1,cost);
    }

    public  void dijkstraAlgorithm(int src){

        PriorityQueue<EdgePair> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a.minCost));
        HashSet<Integer> visited = new HashSet<>();

        priorityQueue.add(new EdgePair(src,0,""+src));

        while (!priorityQueue.isEmpty()){

            EdgePair p = priorityQueue.poll();

            if(visited.contains(p.v)){
                continue;
            }

            visited.add(p.v);

            for(int neigh : map.get(p.v).keySet()){
                if(!visited.contains(neigh)){
                    priorityQueue.add(new EdgePair(neigh, p.minCost + map.get(p.v).get(neigh),p.path + neigh));
                }
            }


        }

    }

    class EdgePair {
        int v;
        String path;
        int minCost;

        EdgePair(int v , int cost, String path) {
            this.v = v;
            this.minCost = cost;
            this.path = path;
        }
    }



}
