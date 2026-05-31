package Assignment3;

import java.util.Scanner;

public class Arrays_Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static void selectionSort(int[] arr){

        for(int i=0; i< arr.length-1 ; i++){
            //int ele = arr[0]; //first Element
            int remainingElementSmallestIndex = i ;
            for(int j = i+1; j<arr.length ; j++){ // Remaining Elements
                if( arr[remainingElementSmallestIndex] > arr[j]){
                    remainingElementSmallestIndex = j;
                }
            }

            int temp =  arr[remainingElementSmallestIndex];
            arr[remainingElementSmallestIndex] = arr[i];
            arr[i] = temp;
        }

    }
}
