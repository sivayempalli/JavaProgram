package Assignment4;

import java.util.Scanner;

public class Arrays_Spiral_Print_Clockwise {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr=new int[m][n];
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }

        spiralPrinting(arr);
    }
    public static void spiralPrinting(int[][] arr){

        int minRow = 0;
        int maxRow = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;
        int count = 0;
        int totalCount = arr.length*arr[0].length;

        while(count < totalCount) {
            for (int i = minCol; i <= maxCol && count < totalCount; i++) {
                System.out.print(arr[minRow][i] + ", ");
                count++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow & count < totalCount; i++) {
                System.out.print(arr[i][maxCol] + ", ");
                count++;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol && count < totalCount; i--) {
                System.out.print(arr[maxRow][i] + ", ");
                count++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow & count < totalCount; i--) {
                System.out.print(arr[i][minCol]+ ", ");
                count++;
            }
            minCol++;

            //System.out.println(count +" "+totalCount);
        }

        System.out.print("END");

    }
}
