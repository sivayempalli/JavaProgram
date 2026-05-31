package LeetCode_150.Arrays_And_Sorting;

public class Length_Of_Last_Word {
    public static void main(String[] args) {
        System.out.println(new Length_Of_Last_Word_Solution().lengthOfLastWord("Hello World"));
        System.out.println(new Length_Of_Last_Word_Solution().lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(new Length_Of_Last_Word_Solution().lengthOfLastWord("luffy is still joyboy"));
    }
}

class Length_Of_Last_Word_Solution {
    public int lengthOfLastWord(String s) {
        boolean charFound = false;
        //String lastString = "";
        int resultCount = 0;
        int len = s.length();

        while(len > 0){

            if(s.charAt(len-1) == ' ' && charFound){
                break;
            }
            else if(s.charAt(len-1) == ' ' && !charFound){

            }else{
                charFound = true;
                //lastString = s.charAt(len) + lastString;
                resultCount++;
            }

            len--;
        }

        return resultCount; //lastString.length();

    }
}
