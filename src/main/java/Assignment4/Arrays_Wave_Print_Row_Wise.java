package Assignment4;

import java.util.Scanner;

public class Arrays_Wave_Print_Row_Wise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] nums = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){

            if(i%2 == 0){

                for(int j=0; j<col; j++){
                    System.out.print(nums[i][j]+", ");
                }


            }
            else{

                for(int j=col-1; j>=0; j--){
                    System.out.print(nums[i][j]+", ");
                }

            }
        }
        System.out.print("END");

    }
}
