package Lec19_Recursive2;

public class Nth_Fib {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibSeries(n));
    }

    public static int fibSeries(int n){
        if(n <= 0) return  0;
        if(n == 1) return  1;

        return  fibSeries(n-1) + fibSeries(n-2);
    }
}
