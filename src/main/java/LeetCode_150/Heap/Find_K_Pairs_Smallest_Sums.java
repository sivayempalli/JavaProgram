package LeetCode_150.Heap;

import java.util.*;

public class Find_K_Pairs_Smallest_Sums {
    public static void main(String[] args) {


    }

}

class Find_K_Pairs_Smallest_Sums_Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.sum));
        pq.offer(new Pair(0, 0, nums1[0]+nums2[0]));

        //iNSTEAD PAIR,2D maTRIC (2 * COLUM + ROW Q)

        List<List<Integer>> result = new ArrayList<>();
        HashSet<Pair> set = new HashSet<>();
        set.add(pq.peek());
        while(k > 0){
            List<Integer> curr = new ArrayList<>();
            Pair smallPair =  pq.poll();
            curr.add(nums1[smallPair.x]);
            curr.add(nums2[smallPair.y]);

            if(smallPair.x + 1 < nums1.length){
                Pair nextPair = new Pair(smallPair.x+1 , smallPair.y, nums1[smallPair.x+1]+nums2[smallPair.y]);

                if(!set.contains(nextPair)) {
                    System.out.println(nextPair.x+"  "+ nextPair.y+"  "+nextPair.sum+"  "+smallPair.x+"  "+smallPair.y);
                    pq.offer(nextPair);
                    set.add(nextPair);
                }
            }

            if(smallPair.y + 1 < nums2.length){
                Pair nextPair = new Pair(smallPair.x , smallPair.y+1, nums1[smallPair.x]+nums2[smallPair.y+1]);
                if(!set.contains(nextPair)) {
                    System.out.println(nextPair.x+"  "+ nextPair.y+"  "+smallPair.x+"  "+smallPair.y);
                    pq.offer(nextPair);
                    set.add(nextPair);
                }
            }

            System.out.println(set);

            k--;
            result.add(curr);
        }

        return  result;

    }

    public class Pair {
        int x,y,sum;
        Pair(int x, int y,int sum){
            this.x = x;
            this.y = y;
            this.sum = sum;
        }

        @Override
        public int hashCode() {
            return this.x + this.y;
        }

        @Override
        public boolean equals(Object obj) {
            Pair other = (Pair) obj;
            return  (this.x == other.x) && (this.y == other.y);
        }
    }
}
