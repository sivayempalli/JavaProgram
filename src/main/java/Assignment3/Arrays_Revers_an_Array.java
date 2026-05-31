package Assignment3;

import java.util.Scanner;

public class Arrays_Revers_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //System.out.println(size);
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int startIndex = 0;
        int endIndex = size-1;

        while(startIndex <= endIndex){
            arr[startIndex] = arr[startIndex] + arr[endIndex] - (arr[endIndex] = arr[startIndex]);
            startIndex++;
            endIndex--;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
