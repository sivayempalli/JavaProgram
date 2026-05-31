package Assignment2;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(armstrong(a));
    }

    static boolean armstrong(int n){
        int noOfDigit = countInt(n);
        int armstrongNum = 0;
        int num = n;
        while(n > 0){
            armstrongNum = armstrongNum + (int)Math.pow(n%10,noOfDigit);
            n = n/10;
        }
        //System.out.println(num +"  "+ armstrongNum);
        if(armstrongNum == num){
            return  true;
        }

        return false;
    }

    static int countInt(int n){
        int count= 0;
        while(n > 0){
            count++;
            n = n/10;
        }
        return count;
    }
}
