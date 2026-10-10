package Lec46;

import java.util.*;

public class Topological_Sort {
    private HashMap<Integer, List<Integer>> map;

    public Topological_Sort(int v) {
        // TODO Auto-generated constructor stub
        map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    public void Addedge(int v1, int v2) {
        map.get(v1).add(v2);
    }

    //all indegree
    public  int[] allEdges(){
        int[] inDegree = new int[map.size()];
        for(int v1 : map.keySet()){
            for(int v2 : map.get(v1)){
                inDegree[v2]++;
            }
        }

        return  inDegree;
    }

    public void TopologicalSort() {
        Queue<Integer> queue = new LinkedList<>();

        int[] indegree = allEdges();
        for(int i=0; i< indegree.length; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        while (!queue.isEmpty()){

            int v1 = queue.poll();
            System.out.print(v1+" ->  ");

            for(int neig : map.get(v1)){
                indegree[neig]--;
                if(indegree[neig] == 0){
                    queue.add(neig);
                }
            }
        }

    }
}
