package LeetCode_150.Two_Pointers;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        System.out.println(new Container_With_Most_Water_Solution().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
class Container_With_Most_Water_Solution {
    public int maxArea(int[] height) {

        int startIndex = 0;
        int endIndex = height.length -  1;
        int maxArea = Integer.MIN_VALUE;

        while(startIndex < endIndex){
            int area = 0;
            if(height[startIndex] >= height[endIndex]){
                int length = (endIndex-startIndex);
                int breadth = height[endIndex];
                area = length * breadth;
                endIndex--;
            }
            else {
                int length = (endIndex-startIndex);
                int breadth = height[startIndex];
                area = length * breadth;
                startIndex++;
            }
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}