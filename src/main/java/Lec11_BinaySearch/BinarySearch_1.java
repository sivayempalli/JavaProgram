package Lec11_BinaySearch;

public class BinarySearch_1 {
    public static void main(String[] args) {
        //x^k <= N
        //Given  x , n
        int n = 149;
        int x = 3;

        System.out.println(root(n,x));


    }

    public static int root(int n , int k){

        int ans = 0;
        int low = 1;
        int high = n;

        while(low <= high){
            int mid  =  (low+high) / 2;
            if(Math.pow(mid,k) <= n){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }
}
