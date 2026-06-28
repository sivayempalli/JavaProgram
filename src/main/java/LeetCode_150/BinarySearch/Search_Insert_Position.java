package LeetCode_150.BinarySearch;

public class Search_Insert_Position {
    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        int target = 5;
        System.out.println(new Search_Insert_Position_Solution().searchInsert(arr,target));
        System.out.println(new Search_Insert_Position_Solution().searchInsert(arr,2));
        System.out.println(new Search_Insert_Position_Solution().searchInsert(arr,7));
        System.out.println(new Search_Insert_Position_Solution().searchInsert(arr,0));

    }
}

class Search_Insert_Position_Solution {
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;
        int result = nums.length;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] >= target){
                result = mid;
                high = mid -1;
            }
            else {
                low = mid+1;
            }
        }

        return  result;

    }
}
