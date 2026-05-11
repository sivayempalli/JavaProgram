package Lec3.Assignment;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int fibPrev = 0;
        int fibNext = 1;
        int fibPrint = 0;

        while(row <= n){
            int i = 1;
            while(i <= row){
                System.out.print(fibPrint+"\t");
                fibPrint = fibNext;
                fibNext = fibNext+fibPrev;
                fibPrev = fibPrint;
                i++;
            }

            System.out.println();
            row++;
        }

    }
}
