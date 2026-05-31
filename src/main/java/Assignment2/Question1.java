package Assignment2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Sum of odd placed and even placed digits
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int odd = 0;
        int even = 0;
        int current = 1;
        while(number > 0){
            if(current%2 != 0){
                odd += (number%10);
            }
            else{
                even += (number%10);
            }
            number = number/10;
            current++;
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
