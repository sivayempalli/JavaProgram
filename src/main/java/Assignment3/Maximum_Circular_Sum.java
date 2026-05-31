package Assignment3;

import java.util.Scanner;

public class Maximum_Circular_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] testCases = new int[t];
        int index = 0;
        while(t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            testCases[index] = maxCircularSum(arr);
            index++;
        }
        for(int testCase : testCases){
            System.out.println(testCase);
        }
    }

    private  static  int maxCircularSum(int[] arr){
        //kadane algo

        int totalSum = arr[0];

        int maxSum = arr[0];
        int maxSumSoFar = arr[0];

        int minSum = arr[0];
        int minSumSoFar = arr[0];

        for(int i=1; i<arr.length; i++) {
            totalSum = totalSum + arr[i];


            maxSum = Math.max(arr[i], maxSum + arr[i]);
            maxSumSoFar = Math.max(maxSumSoFar, maxSum);

            minSum = Math.min(arr[i], minSum + arr[i]);
            minSumSoFar = Math.min(minSum, minSumSoFar);

            //System.out.println(maxSumSoFar +" "+maxSum+" "+minSum+"  "+minSumSoFar);

        }

        //System.out.println(maxSumSoFar +" "+maxSum+" "+minSum+"  "+minSumSoFar);

        if (maxSumSoFar < 0){
            return  maxSumSoFar;
        }

        return  Math.max(maxSumSoFar , totalSum-minSumSoFar);


//        int sum = 0;
//        int maxSum = 0;
//        int firstMaxSum = 0;
//        int idx = -1;
//        boolean firstNegativeSum = false;
//        for(int i=0; i<arr.length; i++){
//            if(sum+arr[i] >= 0){
//                sum = sum + arr[i];
//                if(maxSum <= sum){
//                    maxSum = sum;
//                    idx = i;
//                }
//            }else{
//                if(!firstNegativeSum){
//                    firstMaxSum = maxSum;
//                    firstNegativeSum = true;
//                }
//                sum = 0;
//            }
//        }

//        if(idx == (arr.length-1)){
//            maxSum = maxSum + firstMaxSum;
//        }
//        return maxSum;
    }

}
