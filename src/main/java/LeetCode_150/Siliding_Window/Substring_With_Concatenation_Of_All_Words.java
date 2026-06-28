package LeetCode_150.Siliding_Window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Substring_With_Concatenation_Of_All_Words {
    public static void main(String[] args) {
        List<Integer> outputs = new Substring_With_Concatenation_Of_All_Words_Solution().findSubstring("wordgoodgoodgoodbestword",new String[] {"word","good","best","word"});
        for(Integer output : outputs){
            System.out.println(output);
        }

        outputs = new Substring_With_Concatenation_Of_All_Words_Solution().findSubstring("barfoofoobarthefoobarman",new String[] {"bar","foo","the"});
        for(Integer output : outputs){
            System.out.println(output);
        }
    }
}

class Substring_With_Concatenation_Of_All_Words_Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int startIndex = 0;
        int wordLength = words[0].length();
        int endIndex =  wordLength * words.length  - 1;

        List<Integer> output = new ArrayList<>();

        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i< words.length; i++){
            map.put(words[i] , map.getOrDefault(words[i],0) + 1);
        }

        while (endIndex < s.length()){
            Map<String,Integer> currentMap = new HashMap<>();

            for(int i=startIndex; i<= endIndex; i+= wordLength){
                String subString = s.substring(i,i+wordLength);
                System.out.println(subString);
                currentMap.put(subString , currentMap.getOrDefault(subString,0) + 1);
            }

            if(currentMap.equals(map)){
                output.add(startIndex);
            }

            startIndex++;
            endIndex++;

        }

        return  output;

    }
}
