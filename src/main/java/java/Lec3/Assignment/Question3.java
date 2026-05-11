package Lec3.Assignment;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        /*
            *
          * * *
        * * * * *
          * * *
            *

         */


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total  = n;
        int row = 1;
        int space = n/2;
        int star = 1;

        while(row <= total){
            //int printCount = row;
            int i=1;
            while(i <= space){
                System.out.print("\t");
                i++;
            }
            i=1;
            while(i <= star){
                System.out.print("*\t");
                i++;
            }

            //mirror
            if(row < n/2+1){
                space--;
                star += 2;
            }
            else{
                space++;
                star -= 2;
            }
            System.out.println();

            row++;
        }
    }
}
