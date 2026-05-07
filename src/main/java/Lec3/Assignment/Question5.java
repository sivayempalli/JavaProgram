package Lec3.Assignment;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /*

         *****
         *   *
         *   *
         *   *
         *****

         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int row = 1;

        while(row <= n){
            int i = 1;
            while(i <= space){
                System.out.print(" ");
                i++;
            }
            if(row == 1 || row == n){
                i = 1;
                while(i <= n){
                    System.out.print("*");
                    i++;
                }
            }else{
                i = 1;
                while(i <= n ){
                    if(i == 1 || i == n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    i++;
                }
            }
            System.out.println();
            row++;
            space--;
        }

    }
}
