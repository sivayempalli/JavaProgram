package Assignment4;

import java.util.Scanner;

public class Column_with_Maximum_Sum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[j] = scn.nextInt() + (i == 0 ? 0 : arr[j]) ;
            }
        }

        int maxIndex = 0;
        int maxSum = arr[0];

        for(int j=1; j<n; j++){
            if(maxSum < arr[j]){
                maxSum = arr[j];
                maxIndex = j;
            }
        }

        System.out.println(maxIndex+1+" "+maxSum);

    }
}
