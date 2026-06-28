package LeetCode_150.Hashmap;

public class Valid_Anagram {
    public static void main(String[] args) {
        System.out.println(new Valid_Anagram_Solution().isAnagram("anagram","nagaram"));
        System.out.println(new Valid_Anagram_Solution().isAnagram("rat","car"));
    }
}

class Valid_Anagram_Solution {
    public boolean isAnagram(String s, String t) {
        int[] sString = new int[26];
        int[] tString = new int[26];

        if(s.length() != t.length()){
            return  false;
        }

        for(int i=0; i<s.length(); i++){
            sString[s.charAt(i)-'a']++;
            tString[t.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++){
            if(sString[i] != tString[i]){
                return  false;
            }
        }
        return  true;
    }
}
