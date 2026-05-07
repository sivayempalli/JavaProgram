package Lec3.Assignment;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int print =1;

        while(row <= n){
            int i = 1 ;
            while(i <= row){
                System.out.print(print+"\t");
                print++;
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
