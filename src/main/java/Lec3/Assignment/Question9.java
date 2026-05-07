package Lec3.Assignment;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        /*
        1           1
        1 2       2 1
        1 2 3   3 2 1
        1 2 3 4 3 2 1
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int  space = 2*n - 3;

        while(row <= n){
            int print =1;
            int i =1;
            while(i <= star){
                System.out.print(print+" ");
                print++;
                i++;
            }

            i = 1;
            while(i<= space){
                System.out.print("  ");
                i++;
            }

            i= 1;
            if(row == n){
                i=2;
                print--;
            }
            while(i <= star){
                print--;
                System.out.print(print+" ");
                i++;
            }

            System.out.println();
            row++;
            star++;
            space-= 2;

        }
    }
}
