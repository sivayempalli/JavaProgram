package Lec11_BinaySearch;

import java.util.Arrays;

public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int hours = 6;
        System.out.println(new Koko_Eating_Bananas_Solution().minEatingSpeed(piles,hours));
    }
}

class Koko_Eating_Bananas_Solution {
    public int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);

        long ans = -1;
        long minBananas = 1;
        long maxBananas = 0;
        for(int i=0; i<piles.length ;i++){
            maxBananas += piles[i];
        }

        while(minBananas <= maxBananas){

            long mid =  (minBananas + (maxBananas-minBananas)/2);
            if(isAtleastBananasCanEat(piles,h,mid)){
                ans = mid;
                maxBananas = mid-1;
            }
            else{
                minBananas = mid+1;
            }

        }
        return  (int)ans;
    }

    public boolean isAtleastBananasCanEat(int[] piles, int h , long atleastBananas){

        int totalHoursForAtleastKBananas = 0;
        for(int i=0; i< piles.length ;i++){
            totalHoursForAtleastKBananas += (piles[i]/atleastBananas);
            if((piles[i]%atleastBananas) != 0){
                totalHoursForAtleastKBananas += 1;
            }
        }
        //System.out.println(atleastBananas +" "+totalHoursForAtleastKBananas);

        if(totalHoursForAtleastKBananas <= h){
            return  true;
        }

        return  false;
    }
}
