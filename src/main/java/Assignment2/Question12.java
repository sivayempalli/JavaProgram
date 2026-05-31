package Assignment2;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();
        Long format = 1L;
        Long output = 0L;

        if(num == 0){
            System.out.println(5);
        }
        else {
            while (num > 0) {
                output = format * ((num % 10) == 0 ? 5 : (num % 10)) + output;
                format *= 10;
                num = num / 10;
            }

            System.out.println(output);
        }
    }
}
