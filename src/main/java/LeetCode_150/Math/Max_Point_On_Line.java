package LeetCode_150.Math;

import java.util.HashMap;
import java.util.Map;

public class Max_Point_On_Line {
    public static void main(String[] args) {
        Max_Point_On_Line_Solution maxPointOnLineSolution = new Max_Point_On_Line_Solution();
//        System.out.println(maxPointOnLineSolution.maxPoints(new int[][] {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}}));
//        System.out.println(maxPointOnLineSolution.maxPoints(new int[][] {{1,1},{2,2},{3,3}}));
//        System.out.println(maxPointOnLineSolution.maxPoints(new int[][] {{1,0},{0,0}}));
//        System.out.println(maxPointOnLineSolution.maxPoints(new int[][] {{2,3},{1,1}}));
        //System.out.println(maxPointOnLineSolution.maxPoints(new int[][] {{0,0},{4,5},{7,8},{8,9},{5,6},{3,4},{1,1}}));
        System.out.println(maxPointOnLineSolution.maxPoints(new int[][]{{2,3},{3,3},{-5,3}}));
    }
}

class Max_Point_On_Line_Solution {
    public int maxPoints(int[][] points) {

        //slope y2-y2/x2-x1

        int maxCount = 0;

        for(int i = 0; i< points.length; i++) {
            int[] point1 = points[i];
            Map<Double, Integer> slopeMap = new HashMap<>();
            double MAX = Double.MAX_VALUE;
            for (int j = i + 1; j < points.length; j++) {
                int[] point2 = points[j];
                if (point1[0] == point2[0]) {
                    slopeMap.put(MAX, slopeMap.getOrDefault(MAX, 0) + 1);
                }
                else if (point1[1] == point2[1]){
                    slopeMap.put(0.0, slopeMap.getOrDefault(0.0, 0) + 1);

                } else {
                    double slope = ((double) point2[1] - (double) point1[1]) / ( (double) point2[0] - (double) point1[0]);
                    //System.out.println(slope);
                    slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
                }
            }

            for (Map.Entry<Double, Integer> entry : slopeMap.entrySet()) {
                maxCount = Math.max(entry.getValue(), maxCount);
            }
        }
        return  maxCount+1;

//            Map<Integer,Integer> sumMap = new HashMap<>();
//            Map<Integer,Integer> diffMap = new HashMap<>();
//            Map<Integer,Integer> xAxis = new HashMap<>();
//            Map<Integer,Integer> yAxis = new HashMap<>();
//
//            for(int i=0;i<points.length;i++){
//                int sum = points[i][0] + points[i][1];
//                int diff = points[i][0] - points[i][1];
//                sumMap.put(sum, sumMap.getOrDefault(sum,0) + 1);
//                diffMap.put(diff, diffMap.getOrDefault(diff,0) + 1);
//                xAxis.put(points[i][0], xAxis.getOrDefault(points[i][0],0) + 1);
//                yAxis.put(points[i][1], yAxis.getOrDefault(points[i][1],0) + 1);
//            }
//
//            int maxCount = 0;
//            for (Map.Entry<Integer, Integer> entry : sumMap.entrySet()) {
//                maxCount = Math.max(entry.getValue(), maxCount);
//            }
//            for (Map.Entry<Integer, Integer> entry : diffMap.entrySet()) {
//                maxCount = Math.max(entry.getValue(), maxCount);
//            }
//            for (Map.Entry<Integer, Integer> entry : xAxis.entrySet()) {
//                maxCount = Math.max(entry.getValue(), maxCount);
//            }
//            for (Map.Entry<Integer, Integer> entry : yAxis.entrySet()) {
//                maxCount = Math.max(entry.getValue(), maxCount);
//            }
//
//
//         return maxCount;
    }
}
