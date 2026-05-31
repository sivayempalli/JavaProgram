package Lec11_BinaySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,11,12,15};
        int item = 11;
        System.out.println(search(arr,item));

    }

    public static int search(int[] arr , int item){

        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (high+low)/2;
            //System.out.println(mid);

            if(arr[mid] == item){
                return mid;
            }
            else if(arr[mid] > item){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return  -1;
    }
}
