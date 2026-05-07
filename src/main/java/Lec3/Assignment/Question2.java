package Lec3.Assignment;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*
            *
          * * *
        * * * * 8

         */


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total  = n;
        int row = 1;
        int space = n-1;
        int star = 1;

        while(row <= total){
            int printCount = row;
            int i=1;
            while(i <= space){
                System.out.print("\t");
                i++;
            }
            i=1;
            while(i <= star){ //vertical mirror
                System.out.print(printCount+"\t");
                if(i < star/2 +1) {
                    printCount++;
                }else{
                    printCount--;
                }

                i++;
            }
            System.out.println();

            space--;
            star+=2;
            row++;
        }
    }
}
