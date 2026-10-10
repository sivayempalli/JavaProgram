package Lec25_BackTracking_3;

public class Check_Prime {
    public static void main(String[] args) {
        int n = 289;
    }

    public static boolean isPrime(int  n){

        int div  = 2;

        while(div*div <= n){
            if(n%div == 0){
                return false;
            }
            div++;
        }
        return true;
    }
}
