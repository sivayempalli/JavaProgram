package Lec42_HashMap;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {

    }
}

class Longest_Consecutive_Sequence_Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int maxCount =0;
        for(int i=0; i<nums.length; i++){
            int number = nums[i];
            if(set.contains(number) && !set.contains(number-1)){
                int count = 0;
                while(set.contains(number)){
                    count++;
                    set.remove(number);
                    number++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }

        return  maxCount;

    }
}
