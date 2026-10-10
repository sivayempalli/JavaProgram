package Lec48;

public class Magic_Number {
    public static void main(String[] args) {

    }

    public int nthMagicNo(int n) {
        // code here
        int mul = 5;
        int ans = 0;
        while(n > 0){

            if( (n&1) > 0){
                ans += mul;
            }
            n = n >> 1;
            mul = mul * 5;

        }

        return  ans;
    }
}
