package LeetCode_150.Miscellaneous;

public class MiddleIndex {
    public static void main(String[] args) {
        MiddleIndex_Solution middleIndexSolution = new MiddleIndex_Solution();
        System.out.println(middleIndexSolution.findMiddleIndex(new int[]{2,3,-1,8,4}));
        System.out.println(middleIndexSolution.findMiddleIndex(new int[]{1,-1,4}));
        System.out.println(middleIndexSolution.findMiddleIndex(new int[]{2,5}));
    }
}

class MiddleIndex_Solution {
    public int findMiddleIndex(int[] nums) {
        int len = nums.length;

        int leftMostMiddleIndex= -1;

        int[] leftSuffix =new int[len];
        int[] rightSuffix = new int[len];

        leftSuffix[0] = 0;
        rightSuffix[len-1] = 0;

        for(int i=1; i<len ; i++){
            leftSuffix[i] = leftSuffix[i-1] + nums[i-1];
        }

        for(int i=len-2; i>=0 ; i--){
            rightSuffix[i] = rightSuffix[i+1] + nums[i+1];
        }

        for(int i=0;i<len;i++){
            if(leftSuffix[i] == rightSuffix[i]){
                leftMostMiddleIndex = i;
                break;
            }
        }
        return  leftMostMiddleIndex;
    }
}
