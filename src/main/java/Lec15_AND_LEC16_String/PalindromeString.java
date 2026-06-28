package Lec15_AND_LEC16_String;

public class PalindromeString {
    public static void main(String[] args) {
        String s1 = "nitin";
        System.out.println();
    }

    private  static  boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return  true;
    }
}
