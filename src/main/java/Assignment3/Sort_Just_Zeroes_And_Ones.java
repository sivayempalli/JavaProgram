package Assignment3;

import java.util.Scanner;

public class Sort_Just_Zeroes_And_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //System.out.println(size);
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int zeroIndex = 0;
        int oneIndex = size-1;

        while(zeroIndex < oneIndex){

            if(arr[zeroIndex] == 1){
                int temp  = arr[zeroIndex];
                arr[zeroIndex] = arr[oneIndex];
                arr[oneIndex] = temp;
                oneIndex--;
            }
            else{
                zeroIndex++;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
