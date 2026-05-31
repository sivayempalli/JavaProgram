package Assignment2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // LCM(a,b)= (a*b)/HCF(a,b);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = a*b;

        //Highest Common Factor
        // 4)6(1
        //  4
        //  -
        //  2) 4 ( 2
        //  -  4
        //     -
        //     0

        while(a > 0){
            int rem = b%a;
            b =  a;
            a = rem;
        }
       // System.out.println(b);
        System.out.println((total/b));
    }
}

