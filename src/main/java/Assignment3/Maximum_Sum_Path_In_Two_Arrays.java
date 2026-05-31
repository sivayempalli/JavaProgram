package Assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maximum_Sum_Path_In_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] testCases = new int[t];
        int index = 0;
        while(t-- > 0) {
            int size1 = sc.nextInt();
            int size2 = sc.nextInt();
            int[] arr1 = new int[size1];
            int[] arr2 = new int[size2];
            for (int i = 0; i < size1; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < size2; i++) {
                arr2[i] = sc.nextInt();
            }
            testCases[index] = maxSum(arr1,arr2);
            index++;
        }
        for(int testCase : testCases){
            System.out.println(testCase);
        }
    }

    private static int maxSum(int[] arr1,int[] arr2){

        Map<Integer,Integer> firstArrayMap = new HashMap<>();
        Map<Integer,Integer> secondArrayMap = new HashMap<>();
        Map<Integer,Integer> commonArrayMap = new HashMap<>();
        int sum = 0;
        int prevNum = 0;
        int result = 0;
        for(int i=0;i< arr1.length ;i++){
            sum = sum + arr1[i];
            if(!firstArrayMap.containsKey(arr1[i])){
                firstArrayMap.put(arr1[i],sum);
            }
        }
        System.out.println(firstArrayMap);

        sum = 0;
        for(int i=0;i< arr2.length ;i++){
            sum = sum + arr2[i];

            if(!secondArrayMap.containsKey(arr2[i])){
                secondArrayMap.put(arr2[i],sum);

                if(firstArrayMap.containsKey(arr2[i])){
                    commonArrayMap.put(arr2[i],i);
                }
            }
        }

        System.out.println(secondArrayMap);
        System.out.println(commonArrayMap);


        for(Map.Entry<Integer,Integer> entrySet : commonArrayMap.entrySet()){
            int num = entrySet.getKey();
            if (prevNum == 0){

                int firstSum = firstArrayMap.get(num);
                int secondSum = secondArrayMap.get(num);

                result += Math.max(firstSum,secondSum);
                prevNum = num;
            }else{
                int firstSum = firstArrayMap.get(num) - firstArrayMap.get(prevNum);
                int secondSum = secondArrayMap.get(num) - secondArrayMap.get(prevNum);

                result += Math.max(firstSum,secondSum);
                prevNum = num;

            }
        }

        result += Math.max(firstArrayMap.get(arr1[arr1.length -1]) -  firstArrayMap.getOrDefault(prevNum,0),secondArrayMap.get(arr2[arr2.length -1]) -  secondArrayMap.getOrDefault(prevNum,0) );

        return  result;
    }
}
