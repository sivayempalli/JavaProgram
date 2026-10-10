package Lec45_GraphQuestion;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Graph_Bipartite {
    class Solution {
        public boolean isBipartite(int[][] graph) {

            Queue<Bipartite> queue = new LinkedList<>();
            HashMap<Integer,Integer> visited = new HashMap<>();

            for(int i=0; i<graph.length; i++){

                if(visited.containsKey(i)){
                    continue;
                }

                queue.add(new Bipartite(i,0));

                while (!queue.isEmpty()){

                    Bipartite bp = queue.poll();

                    if(visited.containsKey(bp.vertx)){

                        if(bp.dist != visited.get(bp.vertx)){ // Odd Length
                            return  false;
                        }
                        continue;
                    }

                    visited.put(bp.vertx , bp.dist);

                    for(int neigh : graph[bp.vertx]){
                        if(!visited.containsKey(neigh)){
                            queue.add(new Bipartite(neigh, bp.dist + 1));
                        }
                    }

                }


            }

            return  true;

        }

        class Bipartite {
            int vertx;
            int dist;

            Bipartite(int vertx ,int dist){
                this.vertx = vertx;
                this.dist = dist;
            }
        }
    }
}
