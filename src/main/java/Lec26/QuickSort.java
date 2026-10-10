package Lec26;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {1,4,3,2,6,78,12,15,12,11};
        sort(arr,0,arr.length-1);

        for(int num : arr){
            System.out.print(num+"  ");
        }
        System.out.println();;

    }

    public  static void  sort(int[] arr, int si , int ei){

        if(si >= ei){
            return;
        }

        int indx = partition(arr,si,ei);
        sort(arr,si, indx-1);
        sort(arr,indx+1, ei);
    }

    public static int partition(int[] arr, int si, int ei){

        int pivot = arr[ei];
        int currentIndex = si;

        for(int i=si; i<ei; i++){

            if(arr[i] <= pivot){
                //swap
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[i];
                arr[i] = temp;

                currentIndex++;
            }
        }

        //swap
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[ei];
        arr[ei] = temp;

        return  currentIndex;

    }
}
