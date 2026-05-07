package Lec3.Assignment;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        /*
             5                   5
             5 4               4 5
             5 4 3           3 4 5
             5 4 3 2       2 3 4 5
             5 4 3 2 1   1 2 3 4 5
             5 4 3 2 1 0 1 2 3 4 5
             5 4 3 2 1   1 2 3 4 5
             5 4 3 2       2 3 4 5
             5 4 3           3 4 5
             5 4               4 5
             5                   5
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = 2*n+-1;
        int total = 2*n+1;
        int row = 1;

        while(row <= total){
            int print = n;
            int i = 1;
            while(i<= star){
                System.out.print(print);
                i++;
                print--;
            }
            i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            i=1;
            if(row == n+1){
                i =2;
                print++;
            }
            while(i<=star){
                print++;
                System.out.print(print);
                i++;
            }

            if(row < n+1){
                space-=2;
                star+=1;
            }
            else{
                space+=2;
                star-=1;
            }

            row++;
            System.out.println();
        }
    }
}
