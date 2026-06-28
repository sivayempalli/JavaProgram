package Assignment4;

import java.util.Scanner;

public class Mummy_Motivational_Speech {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int m = scn.nextInt();
        int[][] arr=new int[m][m];
        for (int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=scn.nextInt();
            }
        }

        boolean triangleMatrix = true;

        for(int i=0; i<m; i++){
            for(int j=i+1; j<m; j++){
                if(arr[i][j] != 0){
                    triangleMatrix = false;
                    break;
                }
            }
            if(!triangleMatrix){
                break;
            }
        }

        if(triangleMatrix){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
