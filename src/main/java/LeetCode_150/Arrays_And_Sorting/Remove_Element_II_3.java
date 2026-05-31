package LeetCode_150.Arrays_And_Sorting;

public class Remove_Element_II_3 {
    public static void main(String[] args) {

        Remove_Element_3_Solution s = new Remove_Element_3_Solution();
        int[] nums1 = new int[]{1,1,1,2,2,3};
        int k = s.removeElement(nums1);

        for (int i = 0; i < k; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}

class Remove_Element_3_Solution {
    public int removeElement(int[] nums) {

        int startIndex = 0;
        int uniqueIndex = 0;
        int n = nums.length;
        int[] arr= new int[20001];

        while(uniqueIndex < n ){
            if(arr[nums[startIndex]+10000] < 2){
                arr[nums[startIndex]+10000]++;
                startIndex++;
                uniqueIndex++;
            }
            else{
                while(uniqueIndex < n &&arr[nums[uniqueIndex]+10000] >= 2){
                    uniqueIndex++;
                }
                if(uniqueIndex == n){
                    break;
                }
                arr[nums[uniqueIndex]+10000]++;
                int x = nums[startIndex];
                nums[startIndex] = nums[uniqueIndex];
                nums[uniqueIndex] = x;
                uniqueIndex++;
                startIndex++;
            }
        }

        return startIndex;

    }
}