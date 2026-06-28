package Assignment4;

import java.util.Scanner;

public class Find_Square_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long result = 1;

        for(long i = 2; i <= n / i; i++){
            result = i;
        }

        System.out.println(result);
    }
}
