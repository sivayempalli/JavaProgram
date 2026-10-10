package LeetCode_150.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Find_Median_Data_Stream {

}


class MedianFinder {

    PriorityQueue<Integer> minHeap ;
    PriorityQueue<Integer> maxHeap ;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {

        if(minHeap.size() == maxHeap.size()){
            //atleast one greater in maxheap

            minHeap.offer(num);
            int minEle = minHeap.poll();
            maxHeap.offer(minEle);
        }
        else{

            maxHeap.offer(num);
            int maxEle = maxHeap.poll();
            minHeap.add(maxEle);
        }

    }

    public double findMedian() {
        double result = 0.0;

        if(minHeap.size() == maxHeap.size()){
            int ele1 = maxHeap.peek();
            int ele2 = minHeap.peek();
            result =   (ele1 + ele2)/ 2.0;
        }
        else{
            result = maxHeap.peek();
        }

        return result;

    }
}