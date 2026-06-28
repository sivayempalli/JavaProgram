package LeetCode_150.BinarySearch;

public class Find_First_And_Last_Position_Of_Element_In_Sorted_Array {
    public static void main(String[] args) {
        int[] results = new Find_First_And_Last_Position_Of_Element_In_Sorted_Array_Solution().searchRange(new int[]{5,7,8,8,8,10}, 9);
        for(int result : results ){
            System.out.println(result);
        }
    }
}

class Find_First_And_Last_Position_Of_Element_In_Sorted_Array_Solution {
    public int[] searchRange(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1 ;
        int leftIndex = -1;
        int rightIndex = -1;

        while(low <= high){
            int mid = (low+high)/2;
            //System.out.println(mid);
            if(nums[mid] == target){
                leftIndex = mid;
                high = mid-1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        low = 0;
        high = nums.length - 1 ;

        while(low <= high){
            int mid = (low+high)/2;
            //System.out.println(mid);
            if(nums[mid] == target){
                rightIndex = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }

        if(leftIndex != -1){
            return new int[]{leftIndex,rightIndex};
        }

        return new int[]{-1,-1};

    }
}
