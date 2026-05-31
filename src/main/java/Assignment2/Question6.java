package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        //Nth Fibonacci (Hard)
        Scanner sc = new Scanner(System.in);
        int nthFib = sc.nextInt();
        if (nthFib == 0) {
            System.out.println(0);
        } else if (nthFib == 1) {
            System.out.println(1);
        } else {
            int first = 0; //i = 0
            int second = 1; // i = 1
            for (int i = 2; i <= nthFib; i++) {
                int next = first + second;
                first = second;
                second = next;
                //System.out.println(i+" "+second);
            }
            System.out.println(second);
            int[] dp = new int[nthFib+1];
            Arrays.fill(dp,-1);
            System.out.println(fibSeries(nthFib,dp));
        }

    }

    public static int fibSeries(int nthFib, int[] dp){
            if(nthFib == 0){
                return  0;
            }

            if(nthFib == 1){
                return  1;
            }

            if(dp[nthFib] != -1){
                return dp[nthFib];
            }

            return fibSeries(nthFib-1,dp) + fibSeries(nthFib-2,dp);
    }
}
