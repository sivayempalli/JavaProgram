package Assignment2;

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digitSum  = digitSum(num);
        int sum = factor(num);
        if(digitSum  == sum){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        System.out.println(sum +"   "+ digitSum );
    }

    static int digitSum(int num){
        int sum = 0;
        while (num > 0){
            sum += (num%10);
            num = num/10;
        }
        return sum;
    }

    static int factor(int num){

        int sum = 0;
        //int start = 2;
        for(int start = 2; start <= num ; start++){
            while(num%start == 0){
                sum += digitSum(start);
                num = num/start;
            }
        }
        return  sum;
    }
}
