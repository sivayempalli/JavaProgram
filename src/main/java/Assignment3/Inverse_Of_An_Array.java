package Assignment3;

import java.util.Scanner;

public class Inverse_Of_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        recursiveInverse(arr, 0);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static  void recursiveInverse(int[] arr , int currIndx){

        //break
        if(currIndx >= arr.length){
            return;
        }

        int inverseIndex = arr[currIndx];
        recursiveInverse(arr,currIndx+1);
        arr[inverseIndex] = currIndx;
    }
}


