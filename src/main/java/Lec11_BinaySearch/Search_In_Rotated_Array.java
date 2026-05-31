package Lec11_BinaySearch;

public class Search_In_Rotated_Array {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int target = 1;

        int lower = 0;
        int high = arr.length - 1;

        while(lower <= high){

            int mid = lower + (high-lower)/2;
            System.out.println(lower+" "+high+" "+mid);
             if(arr[mid] == target){
                 System.out.println(mid);
                 break;
             }
             else if(arr[mid] >= arr[lower]){
                 //upper line
                 if(arr[mid] > target && arr[lower] <= target){
                     high = mid-1;
                 }
                 else{
                     lower = mid+1;
                 }
             }
             else{
                 //lower line

                 if(arr[mid] < target && arr[high] >= target){
                     lower = mid + 1;
                 }else{
                     high = mid - 1;
                 }
             }

        }

    }
}
