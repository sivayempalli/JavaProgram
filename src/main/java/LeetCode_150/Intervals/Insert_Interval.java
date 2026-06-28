package LeetCode_150.Intervals;

import java.util.ArrayList;

public class Insert_Interval {
    public static void main(String[] args) {
        int[][] results = new Insert_Interval_Solution().insert(new int[][] {{3,5},{12,15}}, new int[]{6,7});

        for (int[] result : results) {
            System.out.println(result[0] + "   " + result[1]);
        }
        System.out.println();

//        results = new Insert_Interval_Solution().insert(new int[][] {{3,5},{6,7},{8,10},{12,16}}, new int[]{1,2});
//
//        for (int[] result : results) {
//            System.out.println(result[0] + "   " + result[1]);
//        }
//        System.out.println();

//        results = new Insert_Interval_Solution().insert(new int[][] {{3,5},{6,7},{8,10},{12,16}}, new int[]{17,18});
//
//        for (int[] result : results) {
//            System.out.println(result[0] + "   " + result[1]);
//        }
//        System.out.println();

//        results = new Insert_Interval_Solution().insert(new int[][] {{3,5},{6,7},{8,10},{12,16}}, new int[]{4,13});
//
//        for (int[] result : results) {
//            System.out.println(result[0] + "   " + result[1]);
//        }
//        System.out.println();
    }
}

class Insert_Interval_Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<Integer> output = new ArrayList<>();
        int firstNewInterval = newInterval[0];
        int secondNewInterval = newInterval[1];

        if(intervals.length == 0){
            output.add(firstNewInterval);
            output.add(secondNewInterval);
        }
        else if(secondNewInterval < intervals[0][0]){
            output.add(firstNewInterval);
            output.add(secondNewInterval);
            for (int[] interval : intervals) {
                output.add(interval[0]);
                output.add(interval[1]);
            }
        }
        else if(intervals[intervals.length - 1][1] < firstNewInterval){
            for (int[] interval : intervals) {
                output.add(interval[0]);
                output.add(interval[1]);
            }
            output.add(firstNewInterval);
            output.add(secondNewInterval);
        }
        else {

            boolean newIntervalFound = false;

            for (int i = 0; i < intervals.length; i++) {
                int first = intervals[i][0];
                int second = intervals[i][1];

                if(secondNewInterval < first){
                    newIntervalFound = true;
                    break;
                }
                else if (firstNewInterval <= second) {
                    intervals[i][1] = Math.max(second, secondNewInterval);
                    intervals[i][0] = Math.min(first, firstNewInterval);
                    break;
                }
            }

            if(newIntervalFound){
                boolean firstTime = false;
                for (int[] interval : intervals) {
                    int first = interval[0];
                    int second = interval[1];

                    if (second < firstNewInterval){
                        output.add(first);
                        output.add(second);
                    }
                    else if(secondNewInterval < first && firstTime) {
                        output.add(first);
                        output.add(second);
                    }
                    else {
                        output.add(firstNewInterval);
                        output.add(secondNewInterval);

                        output.add(first);
                        output.add(second);

                        firstTime = true;
                    }
                }
            }
            else {
                for (int[] interval : intervals) {
                    int first = interval[0];
                    int second = interval[1];

                    if (output.isEmpty()) {
                        output.add(first);
                        output.add(second);
                    } else if (output.get(output.size() - 1) >= first) {

                        if (output.get(output.size() - 1) < second) {
                            output.remove(output.size() - 1);
                            output.add(second);
                        }
                    } else {
                        output.add(first);
                        output.add(second);
                    }
                }
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
