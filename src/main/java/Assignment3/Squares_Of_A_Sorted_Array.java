package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Squares_Of_A_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //System.out.println(size);
        int[] arr = new int[size];
        int[] newarr = new int[size];
        int firstPositiveIndex = size;
        int lastNegativeIndex = -1;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

            if(arr[i] >= 0 && firstPositiveIndex == size){
                firstPositiveIndex = i;
                lastNegativeIndex = i-1;
            }
            //arr[i] = arr[i] * arr[i];
        }
        System.out.println(firstPositiveIndex);

        int index = 0;
        while(lastNegativeIndex >= 0 && firstPositiveIndex < size){
            if(arr[lastNegativeIndex]*arr[lastNegativeIndex] <=  arr[firstPositiveIndex]*arr[firstPositiveIndex] ){
                newarr[index] = arr[lastNegativeIndex]*arr[lastNegativeIndex];
                lastNegativeIndex--;
            }else{
                newarr[index] = arr[firstPositiveIndex]*arr[firstPositiveIndex];
                firstPositiveIndex++;
            }
            index++;
        }

        while(lastNegativeIndex >= 0){
            newarr[index] = arr[lastNegativeIndex]*arr[lastNegativeIndex];
            lastNegativeIndex--;
            index++;
        }

        while(firstPositiveIndex < size){
            newarr[index] = arr[firstPositiveIndex]*arr[firstPositiveIndex];
            firstPositiveIndex++;
            index++;
        }

        //Arrays.sort(arr);
        for(int i=0; i<newarr.length; i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
