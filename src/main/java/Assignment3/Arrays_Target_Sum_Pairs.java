package Assignment3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            map.put(arr[i],i);
        }
        int target = sc.nextInt();
        printPairSumTarget(arr,target);
    }

    private static void printPairSumTarget(int[] arr, int target){

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            if(arr[start] + arr[end] == target){
                System.out.println(arr[start] +" and "+arr[end]);
                start++;
                end--;
            } else if (arr[start] + arr[end] > target) {
                end--;
            }
            else{
                start++;
            }
        }

    }
}
