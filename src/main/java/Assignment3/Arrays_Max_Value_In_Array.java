package Assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Arrays_Max_Value_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //int[] arr = new int[size];
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            maxValue = Math.max(sc.nextInt(),maxValue);
        }
        System.out.println(maxValue);
    }
}
