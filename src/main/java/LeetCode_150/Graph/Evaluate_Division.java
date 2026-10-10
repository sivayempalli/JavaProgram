package LeetCode_150.Graph;

import java.util.*;

public class Evaluate_Division {
    class Solution {
        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {


            //create a  directed graph , and for each query calculate the  equation

            Map< String , Map<String, Double>> map = new HashMap<>();
            for(int i=0; i<equations.size(); i++){
                String A = equations.get(i).get(0);
                String B = equations.get(i).get(1);

                if(!map.containsKey(A)){
                    map.put(A,new HashMap<>());
                }

                if(!map.containsKey(B)){
                    map.put(B, new HashMap<>());
                }

                map.get(A).put(B,values[i]);
                map.get(B).put(A,1.0/values[i]);
            }

            double[] result = new double[queries.size()];
            int i=0;
            for(List<String> query : queries){
                result[i] = BFS(query.get(0),query.get(1), map);
                i++;
            }
            return result;
        }

        double BFS(String src , String des, Map< String , Map<String, Double>> map){

            if(!map.containsKey(src) || !map.containsKey(des)){
                return -1.0;
            }

            Queue<VertexPair> queue = new LinkedList<>();
            HashSet<String> visited = new HashSet<>();
            queue.add(new VertexPair(src,src,1.0));

            while (!queue.isEmpty()){

                VertexPair vp = queue.poll();

                if(visited.contains(vp.v1)){
                    continue;
                }

                visited.add(vp.v1);

                if (vp.v1.equals(des)){
                    return  vp.cost;
                }

                for(String neigh : map.get(vp.v1).keySet()){

                    if(!visited.contains(neigh)){
                        queue.add(new VertexPair(neigh, vp.v1, vp.cost * map.get(vp.v1).get(neigh)));
                    }

                }
            }

            return  -1.0;

        }

        public  class VertexPair{
            String v1;
            String v2;
            Double cost;

            public VertexPair(String v1, String v2, Double cost) {
                this.v1 = v1;
                this.v2 = v2;
                this.cost = cost;
            }
        }
    }
}
