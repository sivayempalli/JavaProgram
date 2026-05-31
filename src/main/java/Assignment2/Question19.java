package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> answer = new ArrayList<>();

        while(t > 0) {

            int num = sc.nextInt();
            int evenSum = 0;
            int oddSum = 0;

            while(num > 0){
                int rem = num%10;
                if(rem%2 == 0){
                    evenSum += rem;
                }
                else{
                    oddSum += rem;
                }
                num = num/10;
            }
            //System.out.println(evenSum +" " +oddSum);
            if(evenSum%4 == 0 || oddSum%3 == 0){
                answer.add("Yes");
            }
            else {
                answer.add("No");
            }
            t--;
        }

        for(String ans : answer){
            System.out.println(ans);
        }
    }
}
