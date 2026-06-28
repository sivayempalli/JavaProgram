package Assignment4;

import java.util.Scanner;

public class Arrays_Spiral_Print_Anticlockwise {
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

        int minRow = 0;
        int maxRow = row-1;
        int minCol = 0;
        int maxCol = col-1;

        int count = 0;
        int totalCount = row*col;

        while (count < totalCount) {
            for (int i = minRow; i <= maxRow && count < totalCount; i++) {
                System.out.print(nums[i][minCol] + ", ");
                count++;
            }
            minCol++;

            for (int i = minCol; i <= maxCol && count < totalCount; i++) {
                System.out.print(nums[maxRow][i] + ", ");
                count++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow && count < totalCount; i--) {
                System.out.print(nums[i][maxCol] + ", ");
                count++;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol && count < totalCount; i--) {
                System.out.print(nums[minRow][i] + ", ");
                count++;
            }
            minRow++;
        }

        System.out.print("END");


    }
}
