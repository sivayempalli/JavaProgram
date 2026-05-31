package Assignment2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i =1 ; i<=num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
