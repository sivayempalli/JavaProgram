package Assignment3;

import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        int count = 1;
        int majorElement = arr[0];

        for(int i=1; i<n ; i++){
            //System.out.println(nums[i]+" "+majorElement+" "+count);
            if(majorElement != arr[i]){
                count--;
                if(count == 0){
                    majorElement = arr[i];
                    count++;
                }
            }else{
                count++;
            }
        }

        System.out.println(majorElement);
    }
}
