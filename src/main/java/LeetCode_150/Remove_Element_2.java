package LeetCode_150;

public class Remove_Element_2 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] nums1 = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int k = s.removeElement(nums1, val);

        for (int i = 0; i < k; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int startIndex = 0;
        int currentIndex = 0;

        while(startIndex < n ){
            if(nums[startIndex] != val){
                startIndex++;
                currentIndex++;
            }else{
                while(currentIndex < n){
                    if(nums[currentIndex] == val ){
                        currentIndex++;
                    }else{
                        break;
                    }
                }
                if(currentIndex == n){
                    break;
                }
                else{
                    int x = nums[startIndex];
                    nums[startIndex] = nums[currentIndex];
                    nums[currentIndex] = x;
                    currentIndex++;
                    startIndex++;
                }
            }

        }
        System.out.println(startIndex);
        return startIndex;

    }
}