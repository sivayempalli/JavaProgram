package LeetCode_150.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] results = new Merge_Intervals_Solution().merge(new int[][] {{1,4},{2,3}});

        for (int[] result : results) {
            System.out.println(result[0] + "   " + result[1]);
        }
    }
}

class Merge_Intervals_Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));

        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            int first = intervals[i][0];
            int second = intervals[i][1];

            if(output.isEmpty()){
                output.add(first);
                output.add(second);
            }
            else if(output.get(output.size() -1) >= first){

                if(output.get(output.size() - 1) < second) {
                    output.remove(output.size() - 1);
                    output.add(second);
                }
            }
            else{
                output.add(first);
                output.add(second);
            }
        }

        System.out.println(output);

        int outLength =output.size() / 2;

        int[][] results = new int[outLength][2];

        for(int index = 0; index < outLength; index++ ){
            results[index][0] = output.get(2 * index);
            results[index][1] = output.get(2 * index + 1);
        }

        return  results;
    }
}
