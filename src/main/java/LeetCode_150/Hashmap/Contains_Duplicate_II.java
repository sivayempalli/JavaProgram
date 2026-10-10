package LeetCode_150.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_II {
}


class Contains_Duplicate_II_Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if(k == 0){
            return  false;
        }

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(map.containsKey(nums[i])) {
                int indx = map.get(nums[i]);
                int diff = i - indx;
                if (diff <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return  false;

    }
}