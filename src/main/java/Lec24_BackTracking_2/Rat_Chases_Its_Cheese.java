package Lec24_BackTracking_2;

import java.util.Scanner;

public class Rat_Chases_Its_Cheese {
    static  int found = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] mat = new char[m][n];
        int[][] ans = new int[m][n];

        for(int i=0;i<mat.length; i++){
            String s = sc.next();
            for(int j=0; i< s.length(); j++){
                mat[i][j] = s.charAt(j);
            }
        }

        print(mat , 0 , 0, ans);

        if(found == 0){
            System.out.println("Not FOund");
        }
    }

    public static void print(char[][] mat , int cr , int cc , int[][] ans){

        if(cr < 0 || cr > mat.length - 1 || cc < 0 || cc > mat[0].length - 1 || mat[cr][cc] == 'X' ){
            return;
        }

        if(cr == mat.length - 1 && cc == mat[0].length - 1){
            ans[cr][cc] = 1;
            found = 1;
            display(ans);
            return;
        }

        mat[cr][cc]  = 'X';
        ans[cr][cc]  = 1;

        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};

        for(int t =0 ;  t< row.length; t++){
            print(mat, cr+ row[t] , cc+ col[t] , ans);
        }

        mat[cr][cc] = '0';
        ans[cr][cc] = 0;

    }

    public  static  void  display(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(ints[j] + " ");
            }
            System.out.println();
        }
    }
}


