package Assignment4;

import java.util.Scanner;

public class Upper_Triangular_Matrix {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int m = scn.nextInt();
        int[][] arr=new int[m][m];
        for (int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=scn.nextInt();
            }
        }

        for (int i=0; i<m; i++){
            for(int j=i-1; j >= 0; j--){
                arr[i][j]= 0;
            }
        }

        for (int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
