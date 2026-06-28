package LeetCode_150.Matrix;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {

    }
}

class Set_Matrix_Zeroes_Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] rowArray = new boolean[row];
        boolean[] colArray = new boolean[col];


        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if (matrix[i][j] == 0){
                    rowArray[i] = true;
                    colArray[j] = true;
                }
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if (rowArray[i] || colArray[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
