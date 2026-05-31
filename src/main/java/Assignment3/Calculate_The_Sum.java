package Assignment3;

import java.util.Scanner;

public class Calculate_The_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        int size = sc.nextInt();
        int sum = 0;
        for(int i=0; i< size; i++){
            sum = ( sum + sc.nextInt() ) % mod;
        }
        int q = sc.nextInt();
        int qPower = getPower(2,q,mod);

        while(q-- > 0) {
            int x = sc.nextInt();
        }

        //System.out.println(qPower);

        System.out.println( ( sum * qPower ) % mod );

    }

    public static int getPower(int a, int b , int mod){

        int ans = 1;

        while(b > 0){

            if(b%a != 0){
                ans = (ans * a) % mod;
                b = b - 1;
            }
            else{
                a = (a * a) % mod;
                b = b / 2 ;
            }
        }

        return  ans;


    }
}
