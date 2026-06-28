package LeetCode_150.BinarySearch;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Maximum_Subarray_Solution().maxSubArray(arr));
    }
}

class Maximum_Subarray_Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i=0; i<nums.length; i++){

            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum , currSum);
        }

        return maxSum;

    }
}
