package LeetCode_150.Arrays_And_Sorting;

public class Trapping_Rain_Water {
    public static void main(String[] args) {

        Trapping_Rain_Water_Solution trappingRainWaterSolution = new Trapping_Rain_Water_Solution();
        System.out.println(trappingRainWaterSolution.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(trappingRainWaterSolution.trap(new int[] {4,2,0,3,2,5}));

    }
}

class Trapping_Rain_Water_Solution {
    public int trap(int[] height) {
        int total = height.length;
        int[] rightMax = new int[total];
        rightMax[total-1] = height[total-1];
        int leftMax = height[0];

        for(int i=total-2; i>=0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int remainingTrap = 0;

        for(int i=1; i<total; i++){
            leftMax = Math.max(leftMax,height[i]);
            remainingTrap +=  (Math.min(leftMax,rightMax[i]) - height[i]);
        }

        return  remainingTrap;
    }
}
