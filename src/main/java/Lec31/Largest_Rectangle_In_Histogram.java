package Lec31;

import java.util.Stack;

public class Largest_Rectangle_In_Histogram {
    public static void main(String[] args) {

    }
}

class Largest_Rectangle_In_Histogram_Solution {
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
