package LeetCode_150.Hashmap;

import java.util.HashMap;

public class Ransom_Note {
    public static void main(String[] args) {
        System.out.println(new Ransom_Note_Solution().canConstruct("aa","aab"));
    }
}

class Ransom_Note_Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<magazine.length(); i++){
            map.put(magazine.charAt(i) , map.getOrDefault(magazine.charAt(i),0) + 1);
        }

       // System.out.println(map);

        for(int i=0; i<ransomNote.length(); i++){
            if(map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) > 0){
                int count = map.get(ransomNote.charAt(i));
                count--;
                map.put(ransomNote.charAt(i),count);
            }else{
                return  false;
            }
        }

        return  true;

    }
}
