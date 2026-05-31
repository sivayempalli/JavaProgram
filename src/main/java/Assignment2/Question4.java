package Assignment2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Binary To Decimal
        Scanner sc = new Scanner(System.in);
        int binaryNumber = sc.nextInt();
        int decimalConverter = 1;
        int decimalNumber = 0;
        while (binaryNumber > 0){
            decimalNumber = decimalNumber + decimalConverter*(binaryNumber%10);
            binaryNumber = binaryNumber/10;
            decimalConverter *= 2;
        }
        System.out.println(decimalNumber);
    }
}
