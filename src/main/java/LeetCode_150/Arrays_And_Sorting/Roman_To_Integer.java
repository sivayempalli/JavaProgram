package LeetCode_150.Arrays_And_Sorting;



import java.util.HashMap;
import java.util.Map;

public class Roman_To_Integer {
    public static void main(String[] args) {
        System.out.println(new Roman_To_Integer_Solution().romanToInt("III"));
        System.out.println(new Roman_To_Integer_Solution().romanToInt("MCMXCIV"));

    }
}

class Roman_To_Integer_Solution {
    public int romanToInt(String s) {
        int integerNumber = 0;
        Map<String,Integer> romanMap = new HashMap<String,Integer>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        romanMap.put("IV",4);
        romanMap.put("IX",9);
        romanMap.put("XL",40);
        romanMap.put("XC",90);
        romanMap.put("CD",400);
        romanMap.put("CM",900);

        for(int i=0; i< s.length(); i++ ){

            if(i+1 < s.length()){
                String romanString = String.valueOf(s.charAt(i)).concat(String.valueOf(s.charAt(i+1)));
                System.out.println(romanString);
                if(romanMap.containsKey(romanString)){
                    integerNumber += romanMap.get(romanString);
                    i = i + 1;
                    continue;
                }
            }

            integerNumber += romanMap.get(String.valueOf(s.charAt(i)));
        }

        return  integerNumber;

        /*
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        } q q
         */

    }
}