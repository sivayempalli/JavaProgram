package LeetCode_150.Arrays_And_Sorting;

public class JumpGame_O1 {
    public static void main(String[] args) {
        JumpGame_O1_Solution jumpGameO1Solution = new JumpGame_O1_Solution();

        int[] nums = {4,2,1,0,4};

        System.out.println(jumpGameO1Solution.canJump(nums));
    }
}

class JumpGame_O1_Solution {
    public boolean canJump(int[] nums) {

        int maxJump = nums[0];
        for(int i=1 ; i< nums.length ; i++){
            if(i <= maxJump){
                maxJump = Math.max(i+nums[i], maxJump);
            }else{
                return  false;
            }

        }
        return  true;

    }
}