package LeetCode_150.Hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Word_Pattern {
    public static void main(String[] args) {

        System.out.println(new Word_Pattern_Solution().wordPattern("abba","dog cat cat dog"));
        System.out.println(new Word_Pattern_Solution().wordPattern("acba","dog cat cat fish"));
    }
}

class Word_Pattern_Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] subString  =  s.split(" ");

        if(subString.length != pattern.length()){
            return  false;
        }

        Map<String, Character> map1 = new HashMap<>();
        Map<Character, String> map2 = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){

            char ch = pattern.charAt(i);
            String word = subString[i];

            if(map2.containsKey(ch) && !map2.get(ch).equals(word)){
                return  false;
            }

            if(map1.containsKey(word) && !map1.get(word).equals(ch)){
                return  false;
            }

            if(!map1.containsKey(word)){
                map1.put(word,ch);
            }

            if(!map2.containsKey(ch)){
                map2.put(ch,word);
            }

        }

        return  true;

//        for(String str : subString){
//            map1.put(str , map1.getOrDefault(str,0) + 1);
//        }
//
//        for (Map.Entry<String,Integer> entry : map1.entrySet()){
//            map2.put(entry.getValue(), map2.getOrDefault(entry.getValue(),0) + 1);
//        }
//
//        System.out.println(map1);
//        System.out.println(map2);
//
//        int[] patternCount = new int[26];
//        for(int i=0; i<pattern.length(); i++){
//            patternCount[pattern.charAt(i) - 'a']++;
//        }
//
//        for(Map.Entry<Integer,Integer> entry : map2.entrySet()){
//            int repeatCount = entry.getKey();
//            int count1 = entry.getValue();
//            int count2 = 0;
//            for(int i=0; i<26; i++){
//                if(patternCount[i] == repeatCount){
//                    count2++;
//                }
//            }
//
//            if(count2 != count1){
//                return  false;
//            }
//
//        }
//
//        return  true;
    }
}
