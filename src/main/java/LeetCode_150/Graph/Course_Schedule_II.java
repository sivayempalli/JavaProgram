package LeetCode_150.Graph;

import java.util.*;

public class Course_Schedule_II {
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            Map<Integer, HashSet<Integer>> map = new HashMap<>();

            //add vertex
            for(int i=0 ; i<numCourses; i++){
                map.put(i, new HashSet<>());
            }
            //add edges
            for(int i=0; i< prerequisites.length; i++){
                int v1 = prerequisites[i][0];
                int v2 = prerequisites[i][1];
                map.get(v2).add(v1);
            }

            int[] indegree = new int[numCourses];

            //get all indegree
            for(int v1 : map.keySet()){
                for(int neigh : map.get(v1)){
                    indegree[neigh]++;
                }
            }

            //start topologicol sort
            int[] ans = new int[numCourses];
            int count = 0;
            Queue<Integer> queue = new LinkedList<>();
            //HashSet<Integer> visited = new HashSet<>();

            for(int i=0; i<numCourses; i++){
                if(indegree[i] == 0){
                    queue.add(i);
                }
            }

            while (!queue.isEmpty()){

                int v = queue.poll();

//                if(visited.contains(v)){
//                    continue;
//                }

                //visited.add(v);

                ans[count] = v;
                count++;

                for(int neigh : map.get(v)){
                    indegree[neigh]--;
                    if(indegree[neigh] == 0){
                        queue.add(neigh);
                    }
                }

            }


            if(count == numCourses){
                return  ans;
            }

            return new int[0];

        }
    }
}
