package LeetCode_150.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Surrounded_Regions {
    class Solution {
        public void solve(char[][] board) {
            //Traverse 0 , with  boarder  , make boolen  visted arr =  true (not possbile for make region) else make region

            int n = board.length;
            int m = board[0].length;

            boolean[][] visited = new boolean[board.length][board[0].length];

            for(int i=0; i< n; i++){
                for(int j=0; j<m; j++){

                    if(i == 0 || j == 0 || i == (n-1) || j == (m-1)){

                        if(board[i][j] == 'O' && !visited[i][j]){

                            Queue<EdgePair> queue = new LinkedList<>();
                            queue.add(new EdgePair(i,j));

                            while (!queue.isEmpty()){

                                EdgePair ep = queue.poll();

                                if(visited[ep.v1][ep.v2]){
                                   continue;
                                }

                                visited[ep.v1][ep.v2] = true;

                                int[] xAxis = {-1,0,1,0};
                                int[] yAxis = {0,-1,0,1};

                                for(int k=0; k < xAxis.length; k++){

                                    int x = xAxis[k] + ep.v1;
                                    int y = yAxis[k] + ep.v2;

                                    if(x >= 0 && x < n && y >=0 && y < m && !visited[x][y] && board[x][y] == 'O'){
                                        queue.add(new EdgePair(x,y));
                                    }
                                }

                            }

                        }

                    }

                }
            }

            for( int i=0; i<n; i++){
                for(int j=0; j<m; j++){

                    if(!visited[i][j] && board[i][j] == 'O'){
                        board[i][j] = 'X';
                    }

                }
            }

        }
    }
    class EdgePair{
        int v1,v2;

        EdgePair(int v1, int v2){
            this.v1 = v1;
            this.v2 = v2;
        }
    }
}
