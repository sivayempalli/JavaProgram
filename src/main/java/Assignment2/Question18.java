package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        String ay = "Aayush";
        String ha = "Harshit";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> answer = new ArrayList<>();

        while(t > 0){

            int maxPhone1 = sc.nextInt();
            int maxPhone2 = sc.nextInt();

            int countPhone = 1;
            int currPhone1 = 0;
            int currPhone2 = 0;

            while(true){

                currPhone1 += countPhone;
                if(currPhone1 > maxPhone1){
                    answer.add(ha);
                    break;
                }
                countPhone++;

                currPhone2 += countPhone;
                if(currPhone2 > maxPhone2){
                    answer.add(ay);
                    break;
                }
                countPhone++;
            }

            t--;
        }

        for(String ans : answer){
            System.out.println(ans);
        }
    }
}
