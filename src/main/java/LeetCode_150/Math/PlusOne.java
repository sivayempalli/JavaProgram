package LeetCode_150.Math;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne_Solution plusOneSolution = new PlusOne_Solution();

        int[] answers = plusOneSolution.plusOne(new int[]{9,8,9,9});
        for(int ans : answers ){
            System.out.print(ans);
        }
        System.out.println();

        answers = plusOneSolution.plusOne(new int[]{9,9,9});
        for(int ans : answers ){
            System.out.print(ans);
        }
        System.out.println();
    }
}

class PlusOne_Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int count = 0;
        for(int i=0; i<len ;i++){
            if (digits[i] == 9){
                count++;
            }
        }

        if(count == len){
            int[] arr = new int[len+1];
            arr[0] = 1;
            return  arr;
        }
        else{
            int prefix = 1;
            for(int i = len-1 ; i >= 0 ; i--){
                int sum = digits[i]+prefix;
                digits[i] = sum%10;
                prefix = sum/10;
            }
            return digits;
        }
    }
}