package LeetCode_150.Miscellaneous;

public class Search_A_2D_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 3;

        System.out.println(new Search_A_2D_Matrix_Solution().searchMatrix(arr,target));

    }
}

class Search_A_2D_Matrix_Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low = 0 ;
        int row = matrix.length;
        int col = matrix[0].length;
        int high = row * col  - 1;

        while(low <= high){

            int mid = (low+high)/2;
            int indxI =  mid / col;
            int indxJ =  mid % col;

            if(matrix[indxI][indxJ] == target){
                return true;
            }
            else if(matrix[indxI][indxJ] > target){
                high = mid - 1;
            }
            else{
                low = mid+ 1;
            }
        }

        return  false;

//        int col = matrix[0].length;
//
//        int indxRow = -1;
//
//        for(int row = 0; row < matrix.length; row++){
//            if( matrix[row][0] <= target && target <=  matrix[row][col-1] ){
//                indxRow = row;
//            }
//        }
//
//        if(indxRow == -1){
//            return false;
//        }
//        else{
//            int[] searchArr = matrix[indxRow];
//            return  searchElement(searchArr,target);
//        }
    }

    boolean searchElement (int[] arr, int target){

        System.out.println( arr[0] +" "+target);
        int  low = 0;
        int  high = arr.length - 1;

        while(low <= high){

            int mid = ( low+high ) / 2 ;

            if(arr[mid] == target){
                return  true;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return  false;
    }
}
