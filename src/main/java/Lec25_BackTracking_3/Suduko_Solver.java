package Lec25_BackTracking_3;

public class Suduko_Solver {
    public static void main(String[] args) {
        
        char[][] puzzle = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'}, 
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        Suduko_Solver_Solution sudukoSolverSolution = new Suduko_Solver_Solution();
        sudukoSolverSolution.solveSudoku(puzzle);

        for(char[] row : puzzle){
            for(char col : row){
                System.out.print(col);
            }
            System.out.println();
        }

        
    }
}

class Suduko_Solver_Solution {
    public void solveSudoku(char[][] board) {
        solve(board , 0 , 0);
    }

    public boolean solve(char[][] board , int row, int col){

        if(col == 9){
            row ++;
            col = 0;
        }

        if(row == 9){
            return  true;
        }

        if(board[row][col] != '.'){
            return  solve(board , row , col + 1);
        }
        else{

            for(int val = 1; val <= 9; val++){

                //System.out.println(val + "  "+ row +"   " +col);

                if(isItSafe(board ,row ,col, (char)('0' + val) )){

                    board[row][col] =  (char)('0' + val) ;
                    //System.out.println(board[row][col]);
                    boolean found = solve(board, row , col + 1);
                    if(found){
                        return  true;
                    }
                    board[row][col] = '.';
                }
            }
        }

        return  false;

    }

    public  boolean isItSafe(char[][] board , int row , int col , char val){
        //row wise

        for(int c=0; c<9; c++){
            if(c != col && board[row][c] == val ){
                return  false;
            }
        }

        // col wise
        for(int r=0; r<9; r++){
            if(r != row && board[r][col] == val ){
                return  false;
            }
        }

        //3* 3 wise
        int rowMatrix = 3 *  (row / 3);
        int colMatrix = 3 *  (col / 3);
        //System.out.println(row+"  " +col+"   "+rowMatrix +"  "+ colMatrix);
        for(int i = rowMatrix; i < rowMatrix+3 ; i++){
            for(int j = colMatrix; j < colMatrix+3; j++ ){

                if(board[i][j] == val){
                    return  false;
                }
            }
        }

        return  true;
    }
}