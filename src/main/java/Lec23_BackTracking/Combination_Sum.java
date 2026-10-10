package Lec23_BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        List< List<Integer> > results = new Combination_Sum_Solution().combinationSum(new int[]{2,3,6,7},7);
        System.out.println(results);
    }
}

class Combination_Sum_Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> results = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        comb(candidates,target,0,current,results,0);
        return results;
    }

    public void comb(int[] candidates, int target, int currentSum , List<Integer> currentList,List<List<Integer>> results, int index ){

        if(currentSum > target){
            return ;
        }

        if(currentSum == target){
            results.add(new ArrayList<>(currentList));
            return;
        }

        for(int i=index; i< candidates.length; i++){
            currentList.add(candidates[i]);
            comb(candidates,target,currentSum + candidates[i] , currentList,results,i);
            currentList.remove(currentList.size() - 1);
        }
    }


}
