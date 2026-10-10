package LeetCode_150.Heap;

import java.util.*;

public class IPO {

}

class IPO_Solution {

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < capital.length; i++) {
            pairs.add(new Pair(profits[i], capital[i]));
        }

        pairs.sort(Comparator.comparingInt(p -> p.capital));

        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.profit - p1.profit); // max heap with

        int currentIndex = 0;
        while ( k > 0) {

            while(currentIndex < capital.length &&  pairs.get(currentIndex).capital <= w){
                pq.offer(pairs.get(currentIndex));
                currentIndex++;
            }

            if(!pq.isEmpty()){
                Pair p = pq.poll();
                w = w + p.profit;

            }else{
                break;
            }


            k--;
        }
        return  w;


    }
//    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
//
//        List<Pair> pairs = new ArrayList<>();
//
//        for(int i=0; i<capital.length; i++){
//            pairs.add(new Pair(profits[i],capital[i]));
//        }
//
//        pairs.sort(Comparator.comparingInt(p -> p.capital));
//
//        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2) -> p2.profit - p1.profit); // max heap with
//
//        int intialCapital = w;
//        for(Pair p : pairs){
//
//            if(p.capital <= intialCapital){
//                pq.offer(p);
//            }else{
//
//                if(pq.isEmpty()){
//                    return  w;
//                }
//
//                 if(k > 0) {
//                     Pair maxProfitPair = pq.poll();
//                     w += maxProfitPair.profit;
//                     intialCapital = intialCapital + maxProfitPair.profit;
//                     k--;
//                 }else {
//                     break;
//                 }
//
//                 if(p.capital <=  intialCapital){
//                     pq.offer(p);
//                 }else{
//                     return w;
//                 }
//            }
//        }
//
//        while (k > 0 && !pq.isEmpty()){
//            Pair maxProfitPair = pq.poll();
//            w += maxProfitPair.profit;
//            k--;
//        }
//
//        return  w;
//
//
//
//    }

    class Pair {
        int profit;
        int capital;

        Pair(int profit, int capital){
            this.profit = profit;
            this.capital = capital;
        }
    }
}
