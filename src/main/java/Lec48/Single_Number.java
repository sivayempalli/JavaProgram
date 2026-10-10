package Lec48;

public class Single_Number {
    public static void main(String[] args) {

    }
}

class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans = ans^nums[i];
        }

        return  ans;
    }
}