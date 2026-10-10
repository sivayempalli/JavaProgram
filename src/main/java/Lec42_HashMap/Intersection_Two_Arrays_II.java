package Lec42_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection_Two_Arrays_II {
    public static void main(String[] args) {

    }
}

class Intersection_Two_Arrays_II_Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            map.put( nums1[i] , map.getOrDefault(nums1[i], 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            if( map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                result.add(nums2[i]);
                int count = map.get(nums2[i]);
                count--;
                map.put(nums2[i] , count);
            }
        }

        int[] output = new int[result.size()];
        for(int i=0; i< result.size(); i++){
            output[i] = result.get(i);
        }
        return  output;

    }
}
