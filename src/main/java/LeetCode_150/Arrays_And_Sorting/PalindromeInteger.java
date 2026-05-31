package LeetCode_150.Arrays_And_Sorting;

public class PalindromeInteger {
    public static void main(String[] args) {
        PalindromeInteger_Solution palindromeIntegerSolution = new PalindromeInteger_Solution();
        System.out.println(palindromeIntegerSolution.isPalindrome(123321));

    }
}

class PalindromeInteger_Solution {
    public boolean isPalindrome(int x) {
        //< 0 , not a palindrom
        if(x < 0){
            return  false;
        }
        //reverse a number
        int reverseNumber = 0;
        int num = x;
        while(x > 0){
            reverseNumber = reverseNumber*10 + (x%10);
            x =x/10;
        }
        if(num == reverseNumber){
            return  true;
        }
        else{
            return  false;
        }
    }
}