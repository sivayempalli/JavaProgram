package Assignment2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Count Digits
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        int repeatDigit = 0;

        while (num > 0){

            if((num%10) == digit){
                repeatDigit++;
            }
            num = num/10;
        }
        System.out.println(repeatDigit);
    }
}
