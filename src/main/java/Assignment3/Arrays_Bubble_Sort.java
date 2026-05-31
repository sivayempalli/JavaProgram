package Assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Arrays_Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static void bubbleSort(int[] arr){

        for(int i=0; i< arr.length-1 ; i++){
            //int ele = arr[0];
            for(int j=1; j<arr.length-i ; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]  = temp;
                }
            }
        }

    }
}
