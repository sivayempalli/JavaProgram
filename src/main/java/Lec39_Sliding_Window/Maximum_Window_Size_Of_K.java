package Lec39_Sliding_Window;

public class Maximum_Window_Size_Of_K {
    public static void main(String[] args) {

    }

    public  static int maximumWindow(int[] arr, int k){

        int sum = 0;
        int ans = 0;

        for(int i=0; i<k; i++){
            sum += arr[i];
        }

        for(int i=k ; i <arr.length; i++){
            //grow
            sum += arr[i];
            //shrink
            sum -= arr[i-k];
            //ans
            ans  = Math.max(sum , ans);
        }
        return ans;
    }
}
