package Lec47_Trie;

import Lec30.P;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Rotting_Oranges {

    class Solution {
        public int orangesRotting(int[][] grid) {

            Queue<Pair> queue = new LinkedList<>();
            int freshOrages = 0;

            //queue , im addong lvele of rotten tomatoes
            // second level rotten tomates i will add by checking adajacent grig , parallel  i will count


            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[i].length; j++){
                    if(grid[i][j] == 2){
                        queue.add(new Pair(i,j));
                    }
                    else if(grid[i][j] == 1){
                        freshOrages++;
                    }
                }
            }

           // HashSet<Pair> visited = new HashSet<>();
            int count = -1;
            int n = grid.length;
            int m = grid[0].length;

            while(!queue.isEmpty()){
                count++;
                for(int i=0; i<queue.size(); i++) {
                    Pair p = queue.poll();

                    if (grid[p.row][p.col] == 2) {
                        continue;
                    }

                    //visited.add(p);


                    int[] xAxis = {-1, 0, 1, 0};
                    int[] yAxis = {0, -1, 0, 1};

                    for (int k = 0; k < xAxis.length; k++) {
                        int x = p.row + xAxis[k];
                        int y = p.col + yAxis[k];
                        Pair newPair = new Pair(x, y);
                        if (x >= 0 && x < n && y >= 0 && y < m  && grid[x][y] == 1) {
                            queue.add(newPair);
                            grid[x][y] = 2;
                            freshOrages--;
                        }
                    }

                    System.out.println(freshOrages);
                }

            }

            return  freshOrages>0 ? -1 : count;

        }
    }

    class  Pair{
        int row,col;

        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
}
