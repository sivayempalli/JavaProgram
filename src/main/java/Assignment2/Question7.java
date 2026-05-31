package Assignment2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //C = (5/9)(F – 32)

        Scanner sc = new Scanner(System.in);
        int minFahrenheit = sc.nextInt();
        int maxFahrenheit = sc.nextInt();
        int steps = sc.nextInt();

        for(int i=minFahrenheit; i<=maxFahrenheit ; i+= steps){
            System.out.println(i+" "+calCelsius(i));
        }
    }

    public static int calCelsius(int fahrenheit){
        return  (5*(fahrenheit - 32))/9;
    }
}
