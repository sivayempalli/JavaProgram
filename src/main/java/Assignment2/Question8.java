package Assignment2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int inverseNum = 0;
        int place = 1;

        while (num > 0){
            int digit = num%10;
            inverseNum = inverseNum + place * (int)Math.pow(10,digit-1);
            num = num/10;
            place++;
        }
        System.out.println(inverseNum);
    }
}
