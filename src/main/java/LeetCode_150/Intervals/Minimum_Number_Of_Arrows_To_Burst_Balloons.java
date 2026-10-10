package LeetCode_150.Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class Minimum_Number_Of_Arrows_To_Burst_Balloons {
    public static void main(String[] args) {
        //System.out.println(new Minimum_Number_Of_Arrows_To_Burst_Balloons_Solution().findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}));
        //System.out.println(new Minimum_Number_Of_Arrows_To_Burst_Balloons_Solution().findMinArrowShots(new int[][]{{1,2},{3,4},{5,6},{7,8}}));
        System.out.println(new Minimum_Number_Of_Arrows_To_Burst_Balloons_Solution().findMinArrowShots(new int[][]{{9,12},{1,10},{4,11},{8,12},{3,9},{6,9},{6,7}}));
    }
}

class Minimum_Number_Of_Arrows_To_Burst_Balloons_Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort( points, (a , b) ->  {
            if(a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        } );

        for(int i=0; i<points.length; i++){
            System.out.println(points[i][0]+"   "+points[i][1]);
        }
        System.out.println();
        int currentIndex = 0;
        int arrowCount = 0;

        while(currentIndex < points.length){
            arrowCount++;
            int arrowNumber = points[currentIndex][1];
            System.out.println(points[currentIndex][0]+"   "+points[currentIndex][1]);
            currentIndex++;
            while(currentIndex < points.length){
                if(arrowNumber >= points[currentIndex][0] && arrowNumber <= points[currentIndex][1]){
                    currentIndex++;
                }
                else if(arrowNumber > points[currentIndex][1]){
                    arrowNumber = points[currentIndex][1];
                    System.out.println(arrowNumber);
                    currentIndex++;
                }else {
                    break;
                }
            }
        }

        return  arrowCount;

    }
}
/*

[[10,16],[2,8],[1,6],[7,12]]
[[1,2],[3,4],[5,6],[7,8]]
[[1,2],[2,3],[3,4],[4,5]]
[[3,9],[7,12],[3,8],[6,8],[9,10],[2,9],[0,9],[3,9],[0,6],[2,8]]
[[9,12],[1,10],[4,11],[8,12],[3,9],[6,9],[6,7]]


 */
