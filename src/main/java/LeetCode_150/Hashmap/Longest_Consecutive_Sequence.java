package LeetCode_150.Hashmap;

import java.util.*;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        System.out.println(new Longest_Consecutive_Sequence_Solution().longestConsecutive(new int[] {1,0,1,2,3}));
    }
}

class Longest_Consecutive_Sequence_Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0 || nums.length == 1){
            return  nums.length;
        }

        Arrays.sort(nums);

//        Map<Integer,Integer> map = new HashMap<>();
//
//        for (int j : nums) {
//            if(!map.containsKey(j)) {
//                map.put(j, 1);
//            }
//        }


       Integer prev = null;
       int count = 0;
       int maxCount = 0;

       // System.out.println(map);

       for(int num : nums){
          //Integer num =  entry.getKey();
          if(prev == null){
              prev = num;
              count++;
          }else{

              if(prev + 1 == num){
                  count++;
              }
              else if(prev == num) {

              }
              else{
                      count = 1;
              }
              prev = num;
          }
          maxCount = Math.max(maxCount , count );
       }

       return  maxCount;
    }
}
