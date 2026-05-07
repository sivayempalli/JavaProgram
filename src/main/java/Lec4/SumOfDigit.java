package Lec4;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 765432;
//        int sum = 0;
//        while(n > 0){
//            sum = sum + (n % 10);
//            n = n / 10;
//        }
//        System.out.println(sum);

        int reverse = 0;
        while (n > 0){
            int rem = n %10;
            reverse =  reverse * 10 + rem;
            n = n / 10;
        }

        System.out.println(reverse);
    }
}
