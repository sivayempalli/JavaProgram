package Lec4;

public class FibSeries {
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        for(int i = 1 ;i<=n ;i++){
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println("fib at "+n+" seriees : "+ a);

    }
}
