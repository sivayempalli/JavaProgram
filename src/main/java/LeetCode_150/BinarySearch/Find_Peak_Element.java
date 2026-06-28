package LeetCode_150.BinarySearch;

public class Find_Peak_Element {
    public static void main(String[] args) {
        System.out.println(new Find_Peak_Element_Solution().findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
}

class Find_Peak_Element_Solution {
    public int findPeakElement(int[] nums) {
        int peakIndex = 0;
        int peakElement = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i-1] < nums[i]){
                if(i+1 < nums.length){
                     if(nums[i] > nums[i+1]){
                         if(peakElement < nums[i]){
                             peakElement = nums[i];
                             peakIndex = i;
                         }
                     }
                }
                else{
                    if(peakElement < nums[i]){
                        peakElement = nums[i];
                        peakIndex = i;
                    }

                }
            }
        }

        return peakIndex;
        /*

        while (l <= r) {
            int mid = l + (r - l) / 2;

            boolean leftOk = (mid == 0) || (nums[mid] > nums[mid - 1]);
            boolean rightOk = (mid == n - 1) || (nums[mid] > nums[mid + 1]);

            if (leftOk && rightOk) {
                return mid;
            }


            if (mid < n - 1 && nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }


         */



    }
}
