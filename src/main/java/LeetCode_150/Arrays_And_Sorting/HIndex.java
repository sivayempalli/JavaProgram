package LeetCode_150.Arrays_And_Sorting;

public class HIndex {
    public static void main(String[] args) {
        HIndex_Solution hIndexSolution = new HIndex_Solution();
        int[] citations = new int[]{1,7,9,4};
        System.out.println(hIndexSolution.hIndex(citations));
    }
}


class HIndex_Solution{

    public int hIndex(int[] citations) {

        int[] countNoOfPages = new int[1001];

        int pageLength = citations.length;

        for(int citation : citations){
            countNoOfPages[citation]++;
        }
        for(int i = 999; i>= 0 ;i--){
            countNoOfPages[i] = countNoOfPages[i] + countNoOfPages[i+1];
            if( countNoOfPages[i] >= i){
                return i;
            }
        }

        return 0;



//        HashMap<Integer,Integer> citationMap = new HashMap<>();
//        int hIndex = 0;
//        int prevCount = 0;
//        for(int citation : citations){
//            citationMap.put(citation,citationMap.getOrDefault(citation,0)+1);
//        }
//        List<Map.Entry<Integer, Integer>> entries = citationMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList());
//        System.out.println(entries);
//        for(Map.Entry<Integer,Integer> entry : entries){
//            int key = entry.getKey(); //citation
//            int val = entry.getValue() + prevCount; //no of papers
//            if(val >= key){
//                hIndex = Math.max(hIndex,key);
//            }else{
//                hIndex = Math.max(hIndex,val);
//            }
//            prevCount = prevCount + val;
//        }
//        return  hIndex;

    }
}
