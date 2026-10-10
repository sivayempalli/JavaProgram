package Lec41_Heap_PQ;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomII {
    public static void main(String[] args) {
    }
}

class MeetingRoomII_Solution {

    public int meetingRoom(int[][] meeting) {

        Arrays.sort(meeting, (a,b) -> a[0] - b[0] );

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]- b[1] );

        pq.offer(meeting[0]);

        for(int i=1; i<meeting.length; i++){
            if(meeting[i][0] >= pq.peek()[1]){
                pq.poll();
            }
            pq.offer(meeting[i]);
        }

        return pq.size();
    }
}

