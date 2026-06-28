package Assignment4;

import java.util.Scanner;

public class Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        boolean[] rowArray = new boolean[row];
        boolean[] colArray = new boolean[col];

        int[][] nums = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if (sc.nextInt() == 1){
                    rowArray[i] = true;
                    colArray[j] = true;
                }
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if (rowArray[i] || colArray[j]){
                    nums[i][j] = 1;
                }
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
