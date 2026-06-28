package Assignment4;

import java.util.Scanner;

public class KTH_ROOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] results = new long[t];
        int index = 0;

        while(t-- > 0){

            long n = sc.nextLong();
            int k = sc.nextInt();

            long low = 1;
            long high = n;
            long ans = 1;

            while(low <= high){

                long mid = high - ((high-low)/2);

                if(Math.pow(mid,k) <= n){
                    //System.out.println(mid +" "+Math.pow(mid,k));
                    ans = mid;
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }

            }

            results[index] = ans;
            index++;

        }
        for(long result : results){
            System.out.println(result);
        }
    }
}
