package LeetCode_150.Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        System.out.println(new Isomorphic_Strings_Solution().isIsomorphic("egg","add"));
        System.out.println(new Isomorphic_Strings_Solution().isIsomorphic("egg","ade"));
        System.out.println(new Isomorphic_Strings_Solution().isIsomorphic("badc","baba"));
    }
}

class Isomorphic_Strings_Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> characterMap = new HashMap<>();
        Set<Character> tMap = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            if(characterMap.containsKey(s.charAt(i))){
                if(characterMap.get(s.charAt(i)) != t.charAt(i)){
                    return  false;
                }

            }
            else {
                if(tMap.contains(t.charAt(i))){
                    return  false;
                }
                else{
                    characterMap.put( s.charAt(i) , t.charAt(i) );
                    tMap.add(t.charAt(i));
                }
            }
        }
        return  true;
    }
}
