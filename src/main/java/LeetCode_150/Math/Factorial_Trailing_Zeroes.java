package LeetCode_150.Math;

public class Factorial_Trailing_Zeroes {
}
//class Solution {
//    public int trailingZeroes(int n) {
//        int sum = 0;
//        for(int i=5;i<=n;i+=5){
//            int num = i;
//            int count = 0;
//            while(num >= 5){
//                if(num%5 == 0){
//                    sum++;
//                    count++;
//                }
//                else{
//                    break;
//                }
//                num = num/5;
//            }
//            //System.out.println(i + "   "+ count);
//        }
//        return sum;
//    }
//}