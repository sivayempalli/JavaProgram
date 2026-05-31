package Assignment3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Arrays_Linear_Search {
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
        System.out.println(map.getOrDefault(target,-1));
       // Arrays.sort(arr);
        //System.out.println(searchTarget(arr,target));
    }

    private static int searchTarget(int[] arr, int target){
        int result = -1;

        int low = -1;
        int high = arr.length-1;

        while(low <= high){
            int mid = (high+low)/2;

            if(arr[mid] == target){
                result  = mid;
                break;
            }else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return  result;

    }
}
