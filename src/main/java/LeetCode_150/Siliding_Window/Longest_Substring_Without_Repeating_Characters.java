package LeetCode_150.Siliding_Window;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        System.out.println(new Longest_Substring_Without_Repeating_Characters_Solution().lengthOfLongestSubstring("abba"));
    }
}

class Longest_Substring_Without_Repeating_Characters_Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = Integer.MIN_VALUE;
        int startIndex = 0;

        if(s.isEmpty()){
            return  0;
        }


        Map<Character, Integer> map = new HashMap<>();

        for(int endIndex =0;  endIndex< s.length(); endIndex++){
            if(map.containsKey(s.charAt(endIndex))){

                startIndex = Math.max( startIndex , map.get(s.charAt(endIndex)) + 1);

                int len = endIndex - startIndex + 1;
                maxLen = Math.max(maxLen , len);

                map.put(s.charAt(endIndex), endIndex);
            }else{

                int len = endIndex - startIndex + 1;
                maxLen = Math.max(maxLen , len);

                map.put(s.charAt(endIndex), endIndex);
            }
        }

        return  maxLen;
    }
}
