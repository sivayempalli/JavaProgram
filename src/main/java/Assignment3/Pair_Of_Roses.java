package Assignment3;

import java.util.*;

public class Pair_Of_Roses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] results = new String[t];
        int index = 0;

        while(t-- > 0) {

            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            results[index] = printPairRoses(arr,target);
            index++;
        }

        for(String result : results){
            System.out.println(result);
        }
    }

    private static String printPairRoses(int[] arr, int target){
        Arrays.sort(arr);
        int firstRose = -1;
        int secondRose = -1;

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            if(arr[start] + arr[end] == target){
                firstRose = arr[start];
                secondRose = arr[end];
                start++;
                end--;
            } else if (arr[start] + arr[end] > target) {
                end--;
            }
            else{
                start++;
            }
        }

        return "Deepak should buy roses whose prices are "+firstRose+" and "+secondRose+".";
    }
}
