package Assignment2;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstBase = sc.nextInt();
        int secondBase = sc.nextInt();
        int num = sc.nextInt();
        int convertBase = convertBase10(num,firstBase);
        int convertBaseNum = convertBaseNum(convertBase,secondBase);
        //System.out.println(convertBase+"     "+convertBaseNum);
        System.out.println(convertBaseNum);

    }

    static int convertBase10(int n,int base){
         int multiply = 1;
         int convertNum = 0;
         while (n > 0){
             convertNum = convertNum +( n%10 * multiply);
             multiply *= base;
             n = n/10;
         }
         return  convertNum;
    }

    static int convertBaseNum(int n,int base){
        int multiply = 1;
        int convertNum = 0;
        while (n > 0){
            convertNum = convertNum +( n%base * multiply);
            multiply *= 10;
            n = n/base;
        }
        return  convertNum;
    }




}
