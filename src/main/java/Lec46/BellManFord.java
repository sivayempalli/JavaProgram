package Lec46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellManFord {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public BellManFord(int v) {
        // TODO Auto-generated constructor stub
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
    }

    class EdgePair{
        int v1;
        int v2;
        int cost;
        EdgePair(int v1, int v2, int cost){
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
    }

    public List<EdgePair> getAllEdgePair(){

        List<EdgePair> ep = new ArrayList<>();
        for(int v1 : map.keySet()){
            for(int v2 : map.get(v1).keySet()){
                ep.add(new EdgePair(v1,v2,map.get(v1).get(v2)));
            }
        }

        return  ep;
    }

    public void BellManford(int src) {
        
    }
}
