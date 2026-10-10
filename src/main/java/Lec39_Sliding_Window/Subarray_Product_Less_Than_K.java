package Lec39_Sliding_Window;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {

    }
}

class Subarray_Product_Less_Than_K_Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int prod = 1;
        int si = 0;
        int ei = 0;
        int ans = 0;

        while(ei < nums.length){

            //grow
            prod = prod*nums[ei];

            //shrink
            while (si <= ei && prod >= k) {
                prod = prod / nums[si];
                si++;
            }


            //ans
            ans  = ans + (ei-si+1);
            ei++;
        }

        return  ans;

    }
}
