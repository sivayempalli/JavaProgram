package LeetCode_150.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Islands {
    class Solution {
        public int numIslands(char[][] grid) {

            //HashSet<EdgePair> visited = new HashSet<>();
            boolean[][] visited = new boolean[grid.length][grid[0].length];

            int count = 0;

            for(int i=0; i < grid.length; i++){
                for(int j=0; j < grid[i].length; j++){

                    if(!visited[i][j] && grid[i][j] == '1'){
                        count++;
                        Queue<EdgePair> queue = new LinkedList<>();
                        queue.add(new EdgePair(i,j));

                        while(!queue.isEmpty()){

                            EdgePair ep1 = queue.poll();
                            //System.out.println(ep1.v1 +"   "+ep1.v2);

                            if(visited[ep1.v1][ep1.v2]) {
                                continue;
                            }

                            visited[ep1.v1][ep1.v2] = true;

                            int[] xAxis = new int[]{-1,0,1,0};
                            int[] yAxis = new int[]{0,-1,0,1};

                            for(int k=0; k< xAxis.length; k++){

                                int x = xAxis[k] + ep1.v1;
                                int y = yAxis[k] + ep1.v2;

                                if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && !visited[x][y] && grid[x][y] == '1'){
                                    queue.add(new EdgePair(x,y));
                                }

                            }

                        }

                    }
                }
            }
            return  count;
        }

        class EdgePair{
            int v1;
            int v2;

            EdgePair(int v1, int v2){
                this.v1 = v1;
                this.v2 = v2;
            }
        }
    }
}
