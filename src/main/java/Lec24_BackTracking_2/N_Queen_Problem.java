package Lec24_BackTracking_2;

import java.util.Scanner;

public class N_Queen_Problem {
    static  int found = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];

        printQueen(board , n , 0 );

        if(found == 0){
            System.out.println("Not FOund");
        }
    }

    public static void printQueen(boolean[][] board , int queen, int row){


        if(queen == 0){
            display(board);
            found = 1;
            return;
        }

        if(row >= board.length){
            return;
        }

        for(int col = 0; col < board[0].length; col++){

            if(isItSafe(board , row , col)){
                System.out.println(row +"  "+col+"   "+ queen);
                board[row][col] = true;
                printQueen(board , queen - 1, row + 1);
                board[row][col] = false;
            }
        }

    }

    public static boolean isItSafe(boolean[][] board , int row , int col){

        int[] rowField = {-1,-1,-1, 0,0, 1,1,1};
        int[] colField = {-1, 0, 1,-1,1,-1,0,1};

        for(int itr = 0; itr < rowField.length; itr++){

            int cr = rowField[itr];
            int cc = colField[itr];

            int count = 1;

            while(true) {

                int cRow = row + count *  cr;
                int cCol = col +  count * cc;


                if(cRow >= 0 && cRow <= board.length -1 && cCol >= 0 && cCol <= board[0].length - 1){

                    if(!board[cRow][cCol]){

                    }
                    else{
                        return  false;
                    }

                }
                else{
                    break;
                }
                count++;
            }
        }

        return  true;
    }

    public  static  void  display(boolean[][] arr){
        for (boolean[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}


