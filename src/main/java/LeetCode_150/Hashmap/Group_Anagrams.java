package LeetCode_150.Hashmap;

import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        List<List<String>> results = new Group_Anagrams_Solution().groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});

        for(List<String> listString : results){
            System.out.println(listString);
        }
    }
}

class Group_Anagrams_Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String> > map = new HashMap<>();
        List<List<String>> results = new ArrayList<>();

        for(String str : strs){
            int[] ch = new int[26];
            for(int i=0; i<str.length(); i++){
                ch[str.charAt(i)- 'a']++;
            }

            StringBuilder newStr = new StringBuilder();
            for(int i=0; i<26; i++){
                int count = ch[i];
                while (count > 0){
                    newStr.append(i + 'a');
                    count--;
                }
            }
            map.computeIfAbsent(newStr.toString() ,k -> new ArrayList<>() ).add(str);
        }

        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            results.add(entry.getValue());
        }

        return  results;

    }
}
