package LeetCode_150.Arrays_And_Sorting;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        Candy_Solution candySolution = new Candy_Solution();
        System.out.println(candySolution.candy(new int[] {1,0,2}));
        System.out.println(candySolution.candy(new int[] {1,2,2}));
        System.out.println(candySolution.candy(new int[] {1,2,2,3,4,5,4,3,3,2,1}));
    }
}

class Candy_Solution {
    public int candy(int[] ratings) {

        int totalCandies = 0;

        int len = ratings.length;
        int[] candies1 = new int[len];
        int[] candies2 = new int[len];
        Arrays.fill(candies1,1);
        for(int i=0; i< len-1 ; i++){
            //incresing order
            if(ratings[i] < ratings[i+1]){
                candies1[i+1] = candies1[i] + 1;
            }
            else if(candies1[i+1] == candies1[i]){
                //candies1[i+1] = candies1[i];
            }
            else{
                candies1[i+1] = 1;
            }
            //maxCandy = Math.max(maxCandy, candies1[i+1]);
        }

        Arrays.fill(candies2,1);

        for(int i=len-2 ; i>=0 ; i--){
            //decreasing order
            // increase order  in rever direction
            if(ratings[i]  > ratings[i+1]){
                candies2[i] = candies2[i+1] + 1;
            }else if(ratings[i] == ratings[i+1]){
                //candies2[i] = candies2[i+1];
            }
            else{
                candies2[i] = 1;
            }
            //maxCandy = Math.max(maxCandy,candies2[i]);
        }

        for(int i=0; i<len ;i++){
           // System.out.println(ratings[i]+"   "+candies1[i]+"     "+candies2[i]);
            totalCandies += Math.max(candies1[i],candies2[i]);
        }

        return totalCandies;
    }
}
