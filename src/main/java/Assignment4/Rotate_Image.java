package Assignment4;

import java.util.Scanner;

public class Rotate_Image {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m = scn.nextInt();
        int[][] arr=new int[m][m];
        for (int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        rotate(arr);
        for(int i=0;i < arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            //System.out.println();
        }


        for(int i=0; i<arr[0].length; i++){
            int j = 0;
            int k = arr.length - 1;
            while (j <= k){
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
                j++;
                k--;
            }
            //System.out.println();
        }

    }
}
