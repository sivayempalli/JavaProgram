package Lec3.Assignment;

import java.util.Scanner;

public class Question6 {
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
        int total  = 2*n-1;
        int row = 1;
        int space = n-1;
        int star = 1;
        int start = row;

        while(row <= total){
            int printCount = start;
            int i=1;
            while(i <= space){
                System.out.print("\t");
                i++;
            }
            i=1;
            while(i <= star){
                System.out.print(printCount+"\t");
                if(i < star/2 +1) {
                    printCount++;
                }else{
                    printCount--;
                }

                i++;
            }

            //mirror
            if(row < n){
                space--;
                star += 2;
                start++;
            }
            else{
                start--;
                space++;
                star -= 2;
            }
            System.out.println();

            row++;
        }
    }
}
