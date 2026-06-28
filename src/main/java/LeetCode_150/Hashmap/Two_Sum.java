package LeetCode_150.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int[] results = new  Two_Sum_Solution().twoSum(new int[] {2,7,11,15}, 9);
        for(int result : results ){
            System.out.println(result);
        }
    }
}

class Two_Sum_Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] results = new int[2];

        for (int i=0; i<nums.length; i++){

            if(map.containsKey(target - nums[i])){
                results[0] = map.get(target - nums[i]);
                results[1] = i;
                return  results;
            }
            else {
                map.put(nums[i] , i);
            }
        }

        return  results;

    }
}
