package Lec39_Sliding_Window;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {

    }
}

class Sliding_Window_Maximum_Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int j=0;

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<k ; i++){

            while(!deque.isEmpty() && nums[deque.getLast()] < nums[i] ){
                deque.removeLast();
            }
            deque.addLast(i);
        }

        ans[j++] = nums[deque.getFirst()];

        for(int i=k; i<n; i++){
            //grow
            while(!deque.isEmpty() && nums[deque.getLast()] < nums[i] ){
                deque.removeLast();
            }
            deque.addLast(i);

            //shrink

            if(i-k == deque.getFirst()){
                deque.removeFirst();
            }

            //ans
            ans[j++] = nums[deque.getFirst()];
        }

        return  ans;

    }
}
