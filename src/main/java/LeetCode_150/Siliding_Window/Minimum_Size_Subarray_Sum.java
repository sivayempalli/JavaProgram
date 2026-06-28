package LeetCode_150.Siliding_Window;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        System.out.println(new Minimum_Size_Subarray_Sum_Solution().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}

class Minimum_Size_Subarray_Sum_Solution {
    public int minSubArrayLen(int target, int[] nums) {
            int minLen = Integer.MAX_VALUE;
            int startIndex = 0;
            int endIndex = 0;
            int currentSum  = 0;

            while( endIndex < nums.length){

                currentSum += nums[endIndex];
                endIndex++;

                while(currentSum >= target){
                    minLen = Math.min(minLen, endIndex- startIndex);
                    currentSum -= nums[startIndex];
                    startIndex++;
                }


               // System.out.println(startIndex + "   " +endIndex +"  "+currentSum);

            }

            if(minLen == Integer.MAX_VALUE){
                return  0;
            }

            return minLen;
    }
}
