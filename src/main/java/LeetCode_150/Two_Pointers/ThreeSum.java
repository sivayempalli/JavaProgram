package LeetCode_150.Two_Pointers;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {

    }
}

class ThreeSum_Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> results = new ArrayList<>();

        Arrays.sort(arr);
        int size = arr.length;
        int target = 0;
        Set<Integer> setFirst = new HashSet<>();

        for(int i=0 ; i<size-2 ; i++){
            int first =arr[i];

            if(setFirst.contains(first)){
                continue;
            }

            setFirst.add(first);

            int secondNumberIndex = i+1;
            int thirdNumberIndex = size-1;

            Set<Integer> setSecond = new HashSet<>();
            while(secondNumberIndex < thirdNumberIndex){
                if(arr[secondNumberIndex] + arr[thirdNumberIndex] + first == target){
                    //System.out.print(first +", "+ arr[secondNumberIndex]+" and "+arr[thirdNumberIndex]);
                    //System.out.println();
                    if(setSecond.contains(arr[secondNumberIndex])){
                        secondNumberIndex++;
                        thirdNumberIndex--;
                        continue;
                    }

                    setSecond.add(arr[secondNumberIndex]);

                    List<Integer> result = new ArrayList<>();
                    result.add(first);
                    result.add(arr[secondNumberIndex]);
                    result.add(arr[thirdNumberIndex]);
                    results.add(result);


                    secondNumberIndex++;
                    thirdNumberIndex--;
                }
                else if(arr[secondNumberIndex] + arr[thirdNumberIndex] + first > target){
                    thirdNumberIndex--;
                }
                else{
                    secondNumberIndex++;
                }
            }
        }


        return  results;
    }
}