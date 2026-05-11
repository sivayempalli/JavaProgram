package Lec3.Assignment;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;

        while(row <= n){

            int i = 1;
            while (i <= row){
                if(i == 1 || i == row){
                    System.out.print(row+"\t");
                }
                else{
                    System.out.print("0\t");
                }
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
