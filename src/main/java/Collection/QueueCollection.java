package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        //Addition : Offer,add
        //retrival : peek
        //removal : poll, remove

        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(6);
        priorityQueue.add(2);
        System.out.println(priorityQueue);
    }
}
