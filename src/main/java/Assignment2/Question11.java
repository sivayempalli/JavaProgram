package Assignment2;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        //minimum = [0,1,2,3,4]
        //maximum = [5,6,7,8,9]
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();
        //Long originalNum = num;
        Long invertNumber = 0L;
        Long count = 1L;

        while(num > 0){
            int rem = (int)(num%10);
            if(rem > 4 ){
                rem = 9 - rem;
            }
            invertNumber = invertNumber +  rem*count ;
            num = num/10;
            count = count*10;
        }

        System.out.println(invertNumber);
    }
}
