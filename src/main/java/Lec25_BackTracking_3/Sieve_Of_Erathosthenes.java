package Lec25_BackTracking_3;

import java.sql.Array;
import java.util.Arrays;

public class Sieve_Of_Erathosthenes {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(countPrime(n));
    }

    public  static  int countPrime(int num){
        int[] prime = new int[num + 1];
        //Arrays.fill(prime,1);
        prime[0] = 1;
        prime[1] = 1;

        for(int i=2; i*i <= num ; i++){

            if(prime[i] == 0){

                for(int j=2; i*j <= num; j++){
                    prime[i*j] = 1;
                }
            }

        }

        int cnt = 0;
        for(int i = 2; i< prime.length; i++){
            if(prime[i] == 0){
                cnt++;
            }
        }

        return cnt;

    }
}
