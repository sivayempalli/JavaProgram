package Lec2;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();

//        int n = 5;
//        int row = 0;

        //Nested Loop
        /*

        * * * *
        * * * *
        * * * *

        */

//        while(row < n) {
//            int i = 0;
//            while (i < n) {
//                System.out.print("* ");
//                i = i + 1;
//            }
//            System.out.println();
//            row = row + 1 ;
//        }

        /*
        *
        * *
        * * *
        * * * *
        */

//        int n = 5;
//        int row = 0;
//
//        while(row < n){
//            int  i = 0;
//            while(i <= row){
//                System.out.print("* ");
//                i = i + 1;
//            }
//            System.out.println();
//            row = row + 1;
//        }

        /*
              *
            * *
          * * *
        * * * *

         */

        int n = 5;
        int row = 1;
        // space star row

        while(row <= n){
            int  i = n;
            while(i > row){
                System.out.print("  ");
                i = i -1;
            }
            while(i >= 1){
                System.out.print(" *");
                i = i - 1;
            }
            System.out.println();
            row = row + 1;
        }

    }
}
