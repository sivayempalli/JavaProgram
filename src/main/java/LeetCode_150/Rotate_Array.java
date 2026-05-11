package LeetCode_150;

public class Rotate_Array {
    public static void main(String[] args) {
        Rotate_Array_Solution rotateArraySolution = new Rotate_Array_Solution();
        int nums[] = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        rotateArraySolution.rotate(nums,k) ;
        for (int val : nums){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}

class Rotate_Array_Solution {
    public void rotate(int[] nums, int k) {

        int len = nums.length;
        k = k%len;
        reverseArray(nums,0 , len-1);
        reverseArray(nums,0, k-1);
        reverseArray(nums,k,len-1);

//
//        int len = nums.length;
//         k = k % len;
//         int currentIndex = 0;
//         int firstElement = 0;
//         int sumOfFirstK = 0;
//         int sumOfPrevK= 0;
//         for(int i= len-k ; i<len ; i++){
//             if(currentIndex == 0){
//                 firstElement = nums[currentIndex];
//                 sumOfPrevK = firstElement;
//             }
//             sumOfFirstK = sumOfFirstK + nums[currentIndex];
//             nums[currentIndex] =nums[i];
//             currentIndex++;
//         }
//
//         for(int i = currentIndex; i< len ; i++){
//             int presentElement = nums[i];
//             nums[i] = firstElement;
//             sumOfFirstK = sumOfFirstK-firstElement+presentElement;
//             sumOfPrevK = firstElement;
//         }

    }

    void reverseArray(int[] nums, int start , int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

    }
}
