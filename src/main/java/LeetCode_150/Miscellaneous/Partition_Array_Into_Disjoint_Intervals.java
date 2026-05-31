package LeetCode_150.Miscellaneous;

public class Partition_Array_Into_Disjoint_Intervals {
    public static void main(String[] args) {
        Partition_Array_Into_Disjoint_Intervals_Solution partitionArrayIntoDisjointIntervalsSolution = new Partition_Array_Into_Disjoint_Intervals_Solution();
        System.out.println(partitionArrayIntoDisjointIntervalsSolution.partitionDisjoint(new int[]{5,0,3,8,6}));
        System.out.println(partitionArrayIntoDisjointIntervalsSolution.partitionDisjoint(new int[]{1,1,1,0,6,12}));
    }
}

class Partition_Array_Into_Disjoint_Intervals_Solution {
    public int partitionDisjoint(int[] nums) {
        int len = nums.length;
        int[] leftExclusiveMaximum = new int[len];
        int[] rightInclusiveMinimum = new int[len];

        leftExclusiveMaximum[0] = 0;
        rightInclusiveMinimum[len-1] = nums[len-1];

        for(int i=1; i<len ; i++){
            leftExclusiveMaximum[i] = Math.max(leftExclusiveMaximum[i-1], nums[i-1]);
        }

        for(int i = len-2 ; i>= 0 ; i--){
            rightInclusiveMinimum[i] = Math.min(rightInclusiveMinimum[i+1],nums[i]);
        }

        int leftMostSizeIndex = -1;

        for(int i=1; i<len ; i++){
            if(leftExclusiveMaximum[i] <= rightInclusiveMinimum[i]){
                leftMostSizeIndex = i;
                break;
            }
        }

        return  leftMostSizeIndex;

    }
}