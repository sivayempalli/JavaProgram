package Assignment2;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int count = 1;
        for(int i=1; i<=100 ;i++){

            if(count > n1){
                break;
            }

            int numGen = 3*i+2;

            if( numGen % n2 != 0  ){
                //System.out.println(i +"   "+ n2);
                System.out.println(numGen);
                count++;
            }
        }
    }
}
