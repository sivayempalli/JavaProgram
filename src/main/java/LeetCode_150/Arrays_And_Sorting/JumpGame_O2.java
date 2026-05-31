package LeetCode_150.Arrays_And_Sorting;

public class JumpGame_O2 {
    public static void main(String[] args) {
        JumpGame_O2_Solution jumpGameO1Solution = new JumpGame_O2_Solution();

        int[] nums = {2,2,0,1,4};

        System.out.println(jumpGameO1Solution.jump(nums));
    }
}

class JumpGame_O2_Solution {
    public int jump(int[] nums) {
        // Dp Approach Tc : n2
        // Range Query Apprach : n

        int fartest = 0;
        int leftRange = 0;
        int rightRange = 0;
        int jump = 0;
        int len = nums.length;

        while(fartest < len-1){

            for (int i = leftRange; i<= rightRange ; i++){
                fartest = Math.max(fartest,i+nums[i]);
            }

            jump++;
            leftRange = rightRange + 1;
            rightRange =  fartest;
        }

        return  jump;
    }
}