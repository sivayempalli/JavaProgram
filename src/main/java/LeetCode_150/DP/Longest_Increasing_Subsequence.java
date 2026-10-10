package LeetCode_150.DP;

import java.util.ArrayList;
import java.util.Arrays;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {

    }
}

class Longest_Increasing_Subsequence_Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp  = new int[nums.length];
        Arrays.fill(dp , 1);

        int maxResult = 1;
        for(int i=1; i<nums.length; i++){
            for(int j = i-1; j>= 0; j--){

                if(nums[i]  > nums[j]){
                    dp[i] = Math.max(dp[i] , 1 + dp[j]);
                }

            }
            maxResult = Math.max(maxResult , dp[i]);
        }

        return  maxResult;
    }

    public int lengthOfLIS1(int[] nums) {
        int[] dp  = new int[nums.length];
        //Arrays.fill(dp , 1);

        dp[0] = nums[0];

        int maxLengthIndex = 1;
        for(int i=1; i<nums.length; i++){
           int indx =  findIndex(dp , 0 , maxLengthIndex-1, nums[i]);
           if(maxLengthIndex == indx){
               maxLengthIndex++;
           }
           dp[maxLengthIndex] = nums[i];
        }

        return  maxLengthIndex;
    }

    int findIndex(int[] dp ,int low , int high, int val){

        int ans = high+1;
        while(low <= high){

            int mid = (low + high)/2;

            if(val <= dp[mid]){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
         return ans;
    }

    //  [10,9,2,5,3,7,101,18]
    //  2 3 18 101
    //  f f t   t
}
