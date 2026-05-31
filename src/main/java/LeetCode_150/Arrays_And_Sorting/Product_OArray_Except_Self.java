package LeetCode_150.Arrays_And_Sorting;

import java.util.Arrays;

public class Product_OArray_Except_Self {
    public static void main(String[] args) {
        Product_OArray_Except_Self_Solution productOArrayExceptSelfSolution = new Product_OArray_Except_Self_Solution();
       int[] outputs = productOArrayExceptSelfSolution.productExceptSelf(new int[]{1,2,3,4});
        for (int output : outputs ){
           // System.out.println(output);
        }

        outputs = productOArrayExceptSelfSolution.productExceptSelf(new int[]{-1,1,0,-3,3});
        for (int output : outputs ){
           // System.out.println(output);
        }

        outputs = productOArrayExceptSelfSolution.productExceptSelf(new int[]{3,-4,-5,-3});
        for (int output : outputs ){
            System.out.println(output);
        }

        outputs = productOArrayExceptSelfSolution.productExceptSelf(new int[]{-3,-3,2});
        for (int output : outputs ){
           // System.out.println(output);
        }

    }
}

class Product_OArray_Except_Self_Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] rightSuffix = new int[size];

        rightSuffix[size-1] = 1;

        for(int i = size-2 ; i>= 0  ; i--){
            rightSuffix[i] = rightSuffix[i+1] * nums[i+1];
        }

        int leftValue = nums[0];
        nums[0] = 1;

        for(int i=1; i< size ; i++){
            int currentValue = nums[i];
            nums[i] = leftValue * nums[i-1];
            leftValue = currentValue;
        }

        for(int i=0;i<size;i++){
            nums[i] = nums[i] * rightSuffix[i];
        }

        return nums;

//        int size = nums.length;
//        int[][] map = new int[62][size];
//        //Arrays.fill(map,-1);
//        for(int i=0; i<map.length ;i++){
//            Arrays.fill(map[i],-1);
//        }
//
//        for(int i=0; i<nums.length ;i++){
//            int[] mappedArray = map[nums[i]+30];
//            for(int j=0 ; j<mappedArray.length ;j++){
//                if(mappedArray[j] == -1){
//                    mappedArray[j] = i;
//                    break;
//                }
//            }
//        }
//
//        for(int i=0; i<nums.length ;i++){
//            int product = 1;
//            for(int j=0; j<map.length ; j++){
//                for(int k=0; k<map[j].length ; k++) {
//                    if (map[j][k] != -1 && map[j][k] != i) {
//                        product = product * (j - 30);
//                    }
//                }
//            }
//            nums[i] = product;
//        }
//
//        return nums;

    }
}