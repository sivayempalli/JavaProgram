package LeetCode_150.Two_Pointers;

public class Valid_Palindrome {
    public static void main(String[] args) {
        System.out.println(new Valid_Palindrome_Solution().isPalindrome("Zeus was deified, saw Suez."));
    }
}

class Valid_Palindrome_Solution {
    public boolean isPalindrome(String s) {
        int startIndex = 0;
        int endIndex = s.length()-1;

        while(startIndex <= endIndex){

            while (!alphaNumericChar(s.charAt(startIndex))){
                startIndex++;
            }

            while (!alphaNumericChar(s.charAt(endIndex))){
                endIndex--;
            }
            if(startIndex  <= endIndex){

                char firstChar = s.charAt(startIndex);
                if(firstChar >= 'A' && firstChar <= 'Z' ){
                    firstChar =  (char) (firstChar - 'A' + 'a');
                }

                char lastChar = s.charAt(endIndex);
                if(lastChar >= 'A' && lastChar <= 'Z' ){
                    lastChar =  (char) (lastChar - 'A' + 'a');
                }

                if(firstChar != lastChar){
                    return  false;
                }

                startIndex++;
                endIndex--;

            }

        }

        return  true;

    }

    public  boolean alphaNumericChar(char c){

        if(c >= 'A' && c <= 'Z'){
            return true;
        }
        else if(c >= 'a' && c <= 'z'){
            return true;
        }
        else return c >= '0' && c <= '9';
    }
}
