package Lec11_BinaySearch;

import java.util.Arrays;
import java.util.Scanner;

public class AggresiveCows {
    public static void main(String[] args) {
        //https://www.spoj.com/problems/AGGRCOW/
        Scanner sc= new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0 ){

            int totalPosition = sc.nextInt();
            int cows = sc.nextInt();
            int[] pos = new int[totalPosition];
            for(int i=0;i<totalPosition;i++){
                pos[i] = sc.nextInt();
            }

            System.out.println(findMaximumDistanceBetweenCows(pos,cows));
        }
    }

    public static int findMaximumDistanceBetweenCows(int[] pos, int cows){

        Arrays.sort(pos);
        int minimumLen = 1;
        int maximumLen = pos[pos.length-1] - pos[0];
        int ans = -1;

        while(minimumLen <= maximumLen){

            int midLen = minimumLen + (maximumLen-minimumLen)/2;

            if(isPossibleToFitCows(pos,cows,midLen)){
                ans = midLen;
                minimumLen = midLen+1;
            }else{
                maximumLen = midLen-1;
            }
        }

        return  ans;
    }

    public static boolean isPossibleToFitCows(int[] pos, int cows , int dis){

        int initialCow = 1;
        int position = pos[0];

        if(initialCow == cows){
            return  true;
        }

        for(int i=1; i < pos.length ;i++){
            int distance = pos[i] - position;
            if(distance >= dis){
                initialCow++;
                position = pos[i];
            }

            if (initialCow >= cows){
                return  true;
            }
        }

        return  false;
    }


}
