package LeetCode_150.Math;

public class PowerNum {
    public static void main(String[] args) {
        PowerNum_Solution powerNumSolution = new PowerNum_Solution();
        System.out.println(powerNumSolution.myPow(2,3));
        System.out.println(powerNumSolution.myPow(2,12));
        System.out.println(powerNumSolution.myPow(2.0,10));
        System.out.println(powerNumSolution.myPow(2,-3));
        System.out.println(powerNumSolution.myPow(2,0));
    }
}

class PowerNum_Solution {
    public double myPow(double x, int n) {

        long nn = n;
        if(nn < 0 ) {
            nn = -1 * nn ;
        }
        double ans = 1.0;

        while(nn > 0){
            if(nn%2 != 0){
                ans = ans * x;
                nn = nn -1;
            }else{
                x = x*x;
                nn = nn/2;
            }
        }

        return (n < 0) ? (1/ans) : ans;
//        boolean negative = false;
//        if(n < 0 ){
//            negative = true;
//            n = n * -1;
//        }
//        int p = 1;
//        while(p <= n){
//            if(p != 1) {
//                x = x * x; //2*2 , 4*4
//            }
//            p = p + p;
//        }
//        //System.out.println(p+"  "+x);
//
//        for(int i = p/2 + 1 ; i<=n; i++){
//            x = x * 2;
//        }
//        //System.out.println(x);
//
//        if(negative){
//            return  1.0/x;
//        }
//
//        return x;
    }
}