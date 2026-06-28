package LeetCode_150.BinarySearch;

public class Find_Minimum_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        System.out.println(new Find_Minimum_In_Rotated_Sorted_Array_Solution().findMin(new int[]{4,5,6,7,8,1,2,3}));
        System.out.println(new Find_Minimum_In_Rotated_Sorted_Array_Solution().findMin(new int[]{4,5,6,7,8,1,2,3}));
    }
}

class Find_Minimum_In_Rotated_Sorted_Array_Solution {
    public int findMin(int[] nums) {

        //case 1
        if(nums.length == 1){
            return nums[0];
        }

        if(nums[0] < nums[nums.length - 1]){
            return  nums[0];
        }

        int minNum = nums[nums.length-1];

        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = (high+low)/2;

            if(minNum > nums[mid]){
                //No Need of Upper Line
                minNum = nums[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return  minNum;
    }
}
