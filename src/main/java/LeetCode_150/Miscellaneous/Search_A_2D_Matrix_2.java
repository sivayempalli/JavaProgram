package LeetCode_150.Miscellaneous;

public class Search_A_2D_Matrix_2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };

        int target = 20;

        System.out.println(new Search_A_2D_Matrix_2_Solution().searchMatrix(arr,target));

    }
}

class Search_A_2D_Matrix_2_Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1 ;

        while(row < matrix.length && col >= 0  ){

            if(matrix[row][col] == target){
                return  true;
            }
            else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return  false;
    }
}
