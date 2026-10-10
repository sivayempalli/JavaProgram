package LeetCode_150.DP;

public class House_Robber {
    public static void main(String[] args) {

    }
}

class House_Robber_Solution {
    public int rob(int[] nums) {

        if(nums.length == 1){
            return  nums[0];
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0] , nums[1]); // important

        for(int i=2; i<nums.length; i++){
            dp[i] = Math.max(nums[i] + dp[i-2] , dp[i-1]);
        }

        return dp[nums.length-1];

    }
}
