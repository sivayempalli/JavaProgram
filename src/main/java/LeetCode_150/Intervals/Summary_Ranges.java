package LeetCode_150.Intervals;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    public static void main(String[] args) {
        List<String> results = new Summary_Ranges_Solution().summaryRanges(new int[] {0,2,3,4,6,8,9,10,11,12,13,14,16});
        for(String result : results){
            System.out.println(result);
        }

    }
}

class Summary_Ranges_Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<>();

        if(nums.length == 0){
            return  results;
        }

        int startRange = nums[0];
        int endRange = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] - 1 == nums[i-1]){
                endRange = nums[i];
            }
            else {

                if(endRange != startRange){
                    String output = startRange + "->" + endRange;
                    results.add(output);
                }else{
                    results.add(String.valueOf(startRange));
                }


                startRange = nums[i];
                endRange = nums[i];
            }
        }

        if(endRange != startRange){
            String output = startRange + "->" + endRange;
            results.add(output);
        }else{
            results.add(String.valueOf(startRange));
        }

        return  results;


    }
}
