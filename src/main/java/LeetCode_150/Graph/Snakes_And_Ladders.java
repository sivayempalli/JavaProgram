package LeetCode_150.Graph;

import javax.xml.namespace.QName;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Snakes_And_Ladders {

    public static void main(String[] args) {
        int[][] board  = {
                {-1,-1,2,-1},
                {14,2,12,3},
                {4,9,1,11},
                {-1,2,1,16}};
                /*
                {
                        {1,1,-1},
                        {1,1,1},
                        {-1,1,1}
                };
                *///{{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1},{-1,35,-1,-1,13,-1},{-1,-1,-1,-1,-1,-1},{-1,15,-1,-1,-1,-1}};

        System.out.println(new Solution().snakesAndLadders(board));
    }

    static class Solution {
        public int snakesAndLadders(int[][] board) {
            Queue<Pair> queue = new LinkedList<>();
            HashSet<Integer> visited  = new HashSet<>();


            queue.add(new Pair(1,0));

            int len = board.length;
            int reachBoard = len * len;

            while (!queue.isEmpty()){

                Pair p = queue.poll();

                int currenPos = p.boardNumber;

                if(visited.contains(currenPos)){
                    continue;
                }

                visited.add(currenPos);

                if(currenPos == reachBoard){
                    return p.reachCount;
                }

                for(int dice = currenPos+1 ; dice <= Math.min(currenPos+6, reachBoard) ; dice++){
                    //2(5,1)  15 27 36
                    int div = dice/len; //1
                    int rem = dice%len;  //0
                    int row = len - 1 - (rem == 0 ? div-1 : div) ; //6-1-0 6-1-2
                    int col = (((len-1-row)%2) == 0) ? ( rem != 0 ? rem-1 : len-1) : (rem != 0 ? len-rem : rem); //left to  right : // right to left

                    System.out.println(dice +"  "+row+"  "+col+" "+board[row][col] +"  " +p.reachCount);

                    if(board[row][col] != -1){
                        //queue.add(new Pair(dice,p.reachCount+1));
                        if(!visited.contains(board[row][col])){
                            queue.add(new Pair(board[row][col], p.reachCount + 1));
                        }
                    }
                    else{
                        //if(!visited.contains(dice)) {
                            queue.add(new Pair(dice, p.reachCount + 1));
                        //}
                    }
                }
            }

            return  -1;

        }

        class Pair {
            int boardNumber,reachCount;
            Pair(int boardNumber, int reachCount){
                this.boardNumber = boardNumber;
                this.reachCount = reachCount;

            }
        }

    }
}
