package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Rowwise_Sort_Matrix {
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
            Arrays.sort(nums[i]);
        }

        for(int i=0;i < nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }


    }
}
