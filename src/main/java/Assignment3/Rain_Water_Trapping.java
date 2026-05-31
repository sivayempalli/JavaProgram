package Assignment3;

import java.util.Scanner;

public class Rain_Water_Trapping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] testCases = new int[t];
        int index = 0;
        while(t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            testCases[index] = trap(arr);
            index++;
        }

        for(int testCase : testCases){
            System.out.println(testCase);
        }

    }

    public static int trap(int[] height) {
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
