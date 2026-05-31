package LeetCode_150.Arrays_And_Sorting;

public class First_Occurrence_In_A_String {
    public static void main(String[] args) {
        System.out.println(new First_Occurrence_In_A_String_Solution().strStr("sadbutsad","sad"));
        System.out.println(new First_Occurrence_In_A_String_Solution().strStr("mississippi","issip"));
        System.out.println(new First_Occurrence_In_A_String_Solution().strStr("ssadbutsad","sad"));
        System.out.println(new First_Occurrence_In_A_String_Solution().strStr("leetcode","leeto"));
    }
}

class First_Occurrence_In_A_String_Solution {
    public int strStr(String haystack, String needle) {

        for(int i=0; i< (haystack.length() - needle.length() + 1) ; i++){
            String substring = haystack.substring(i, i + needle.length());
            //System.out.println(substring);
            if(substring.equals(needle)){
                return i;
            }
        }

        return -1;

//        int j=0;
//        for(int i=0; i< haystack.length(); i++){
//
//            if(j == needle.length()){
//                return i - needle.length();
//            }
//
//            if(haystack.charAt(i) == needle.charAt(j)){
//                j++;
//                continue;
//            }
//
//            j=0;
//            if(haystack.charAt(i) == needle.charAt(j)){
//                j++;
//            }
//
//        }
//
//        if(j == needle.length()){
//            return  haystack.length() -  needle.length();
//        }
//
//        return  -1;

    }
}
