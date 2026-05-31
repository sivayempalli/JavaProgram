package LeetCode_150.Math;

public class SqureRoot {
    public static void main(String[] args) {
        SqureRoot_Solution squreRootSolution = new SqureRoot_Solution();
        System.out.println(squreRootSolution.mySqrt(6));
        System.out.println(squreRootSolution.mySqrt(2147395600));
        System.out.println(squreRootSolution.mySqrt(16));
        System.out.println(squreRootSolution.mySqrt(0));
        System.out.println(squreRootSolution.mySqrt(400000000));

    }
}

class SqureRoot_Solution {
    public int mySqrt(int x) {

        if(x == 0){
            return  0;
        }
        int ans= 1;
        for(long i=1 ; i*i <= x ; i++){
            ans = (int)i;
        }
        return  ans;
    }
}