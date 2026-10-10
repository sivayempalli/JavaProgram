package LeetCode_150.DP_Multidimensional;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {

    }
}

class Triangle_Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int len = triangle.size()+1;
        int[][] dp = new int[2][len]; //think right to left approach
        Arrays.fill(dp[0] , Integer.MAX_VALUE);
        Arrays.fill(dp[1] , Integer.MAX_VALUE);

        for(int i=0; i<triangle.size(); i++){

            if(triangle.get(i).size() == 1){
                dp[0][1] = triangle.get(i).get(0);
            }else{

                int len1 = triangle.get(i).size();
                for(int j=1; j <= len1; j++){
                    dp[i%2][j] =  triangle.get(i).get(j-1) + Math.min(dp[(i-1)%2][j] , dp[(i-1)%2][j-1]);
                }
            }
        }

        int minval = Integer.MAX_VALUE;
        for(int i=0; i<len; i++){
            minval = Math.min(minval, dp[len%2][i]);
        }
        return  minval;
    }
}
