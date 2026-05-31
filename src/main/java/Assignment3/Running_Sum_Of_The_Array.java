package Assignment3;

import java.util.Scanner;

public class Running_Sum_Of_The_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if(i == 0){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            else {
                sum = sum + sc.nextInt();
                arr[i] = sum;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
