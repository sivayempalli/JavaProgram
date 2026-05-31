package Assignment3;

import java.util.Scanner;

public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //System.out.println(size);
        long[] arr = new long[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        long left = 1;
        long[] rightPrefix = new long[size];
        rightPrefix[size-1] = 1;

        for(int i=size-2; i>=0; i--){
            rightPrefix[i] = rightPrefix[i+1] * arr[i+1];
        }

        for(int i=0; i<arr.length; i++){
            long currEle = arr[i];
            arr[i] = left * rightPrefix[i];
            left = left*currEle;
        }

        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
