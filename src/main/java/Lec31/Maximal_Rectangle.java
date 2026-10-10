package Lec31;

import java.util.Stack;

public class Maximal_Rectangle {
    public static void main(String[] args) {

    }
}

class Maximal_Rectangle_Solution {
    public int maximalRectangle(char[][] matrix) {

        int[]  heights = new int[matrix[0].length];
        int maxArea = Integer.MIN_VALUE;

        for(int i=0; i<matrix.length; i++){

            for(int j=0; j< matrix[i].length ; i++){

                if(matrix[i][j] == '0'){
                    heights[j] = 0;
                }
                else{
                    heights[j] = heights[j] + 1;
                }

            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));

        }

        return  maxArea;
    }

    public int largestRectangleArea(int[] heights) {

        int maxArea = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<heights.length; i++){

            while(!st.empty() && heights[i] < heights[st.peek()]){
                int len = heights[st.pop()];
                if(!st.empty()){
                    int area = len * (i - st.peek() - 1);
                    maxArea = Math.max(area , maxArea);
                }else{
                    int area = len * i;
                    maxArea = Math.max(area , maxArea);
                }
            }
            st.push(i);
        }


        int r = heights.length;
        while(!st.empty()){
            int len = heights[st.pop()];
            if(!st.empty()){
                int area = len * (r - st.peek() - 1);
                maxArea = Math.max(area , maxArea);
            }else{
                int area = len * r;
                maxArea = Math.max(area , maxArea);
            }
        }

        return  maxArea;

    }
}
