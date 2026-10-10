package Lec45_GraphQuestion;

import java.util.*;

public class Graph_Valid_Tree {

    class Solution {

        public boolean validTree(int n, int[][] edges) {

            HashMap<Integer , List<Integer>> map = new HashMap<>();

            map = new HashMap<>(n);
            for(int i=1; i<=n; i++){
                map.put(i, new ArrayList<>());
            }

            for(int i=0; i<edges.length; i++){
                int a = edges[i][0];
                int b = edges[i][1];
                map.get(a).add(b);
                map.get(b).add(a);
            }

            return BFT(map);
        }

        boolean BFT(HashMap< Integer , List<Integer>> map){

            HashSet<Integer> visited = new HashSet<>();
            Queue<Integer> queue = new LinkedList<>();
            int count = 0;

            for(Integer v : map.keySet()){

                if(visited.contains(v)){
                    continue;
                }

                count++;

                queue.add(v);

                while (!queue.isEmpty()){

                    int v1 = queue.poll();

                    if(visited.contains(v1)){
                        return false;
                    }

                    visited.add(v1);

                    for(int ngh : map.get(v1)){
                        if(!visited.contains(ngh)){
                            queue.add(ngh);
                        }
                    }

                }

            }

            return  count == 1;

        }

    }

}
