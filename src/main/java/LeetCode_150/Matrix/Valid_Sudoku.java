package LeetCode_150.Matrix;

public class Valid_Sudoku {
    public static void main(String[] args) {

        char[][] board = {
                {'.','8','7','6','5','4','3','2','1'},
                {'2','.','.','.','.','.','.','.','.'},
                {'3','.','.','.','.','.','.','.','.'},
                {'4','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','.','.'},
                {'6','.','.','.','.','.','.','.','.'},
                {'7','.','.','.','.','.','.','.','.'}, 
                {'8','.','.','.','.','.','.','.','.'},
                {'9','.','.','.','.','.','.','.','.'}
        };
                
                
                /*
            {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'},
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        
        */

        System.out.println(new Valid_Sudoku_Solution().isValidSudoku(board));

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(board[i][j]+"   ");
            }
            System.out.println();
        }
    }
}

class Valid_Sudoku_Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){

                    for(int num=1; num <= 9; num++) {
                        //row wise
                        boolean rowNumPresent = false;
                        boolean colNumPresent = false;
                        boolean numPresent = false;
                        for (int row=0; row<9; row++){
                            if(board[row][j] == '0' + num){
                                rowNumPresent = true;
                                break;
                            }
                        }

                        //col wise
                        for (int col=0; col<9; col++){
                            if(board[i][col] == '0' + num){
                                colNumPresent = true;
                                break;
                            }
                        }

                        // 3*3
                        int row =  ( i / 3 ) * 3;
                        int col = ( j / 3 ) * 3;
                        int  rowLen = row+ 3;
                        int colLen = col + 3;

                        //System.out.println(i +'  '+ j +'  '+row+'  '+col );
                        for( ; row < rowLen; row++){
                            for( ; col < colLen; col++){
                                if(board[row][col] == '0'+num){
                                    numPresent = true;
                                    break;
                                }
                            }
                        }

                        if(!rowNumPresent && !colNumPresent && !numPresent){
                            board[i][j] = (char) ('0' +  num);
                            //System.out.println(board[i][j]);
                            if (isValidSudoku(board)){
                                return true;
                            }
                            board[i][j] = '.';
                        }

                    }

                    return  false;

                }
            }
        }

        return  true;
    }
}
