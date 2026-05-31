package Assignment2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Print reverse
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNum = 0;

        while(num > 0 ){
            int rem = num%10;
            reverseNum = reverseNum*10 + rem;
            num = num/10;
        }
        System.out.println(reverseNum);
    }
}
