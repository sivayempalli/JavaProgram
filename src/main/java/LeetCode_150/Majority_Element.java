package LeetCode_150;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 5, 3, 3, 4};
        Majority_Element_Solution majorityElementSolution = new Majority_Element_Solution();
        System.out.println(majorityElementSolution.majorityElement(nums1));
    }


}

class Majority_Element_Solution {
    public int majorityElement(int[] nums) {
        //sort nlogn
        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];
//        int result = 0;
//        int output = 0;

        //Boyer–Moore Majority Vote Algorithm
        int n = nums.length;
        int count = 1;
        int majorElement = nums[0];

        for(int i=1; i<n ; i++){
            //System.out.println(nums[i]+" "+majorElement+" "+count);
            if(majorElement != nums[i]){
                count--;
                if(count == 0){
                    majorElement = nums[i];
                    count++;
                }
            }else{
                count++;
            }
        }

        return majorElement;
//        Map<Integer,Integer> count = new HashMap<>();
//
//        for(int i=0; i<n; i++){
//            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
//        }
//
//
//        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
//            int currVal = entry.getValue();
//            int currKey = entry.getKey();
//            if(result < currVal){
//                result = currVal;
//                output =currKey;
//            }
//        }
//
//        return output;

    }
}