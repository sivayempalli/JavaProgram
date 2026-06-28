package LeetCode_150.Siliding_Window;

public class Minimum_Window_Substring {
    public static void main(String[] args) {
        System.out.println(new Minimum_Window_Substring_Solution().minWindow("ADOBECODEBANC","ABC"));
        System.out.println(new Minimum_Window_Substring_Solution().minWindow("ADOBECODEBANC","DBE"));
    }
}

class Minimum_Window_Substring_Solution {
    public String minWindow(String s, String t) {

        int minLen = Integer.MAX_VALUE;
        int minInd = 0;
        int startIndex = 0;
        int[] lowerCh = new int[26];
        int[] upperCh = new int[26];

        for(int i=0; i<t.length(); i++){
            if (t.charAt(i) >= 'A' && t.charAt(i) <= 'Z') {
                upperCh[t.charAt(i)-'A']++;
            }
            else{
                lowerCh[t.charAt(i)-'a']++;
            }
        }

        //System.out.println(lowerCh);
        int[] currentLowerCh = new int[26];
        int[] currentUpperCh = new int[26];

        for(int endIndex=0; endIndex < s.length(); endIndex++){
            //add index
            if (s.charAt(endIndex) >= 'A' && s.charAt(endIndex) <= 'Z') {
                currentUpperCh[s.charAt(endIndex) -  'A']++;
            }
            else{
                currentLowerCh[s.charAt(endIndex) - 'a']++;
            }

            //System.out.println(s.charAt(endIndex));

            if(foundSubstring(currentUpperCh,currentLowerCh,lowerCh,upperCh)){

                 while(startIndex <= endIndex){
                     //System.out.println(startIndex +"  "+endIndex +"  "+ minLen+ "  "+minInd);
                     int len = endIndex- startIndex + 1;
                     if(minLen > len){
                         minInd= startIndex;
                         minLen = len;
                     }
                     if (s.charAt(startIndex) >= 'A' && s.charAt(startIndex) <= 'Z') {
                         currentUpperCh[s.charAt(startIndex) - 'A']--;
                     }
                     else{
                         currentLowerCh[s.charAt(startIndex) - 'a']--;
                     }
                     startIndex++;
                     if(foundSubstring(currentUpperCh,currentLowerCh,lowerCh,upperCh)){

                     }else{
                         break;
                     }

                 }
            }
        }
        //System.out.println(minLen +" "+minInd);
        if(minLen != Integer.MAX_VALUE){
            return s.substring(minInd,minInd+minLen);
        }

        return  "";

    }

    public boolean foundSubstring(int[] currentUpperCh,  int[] currentLowerCh , int[] lowerCh, int[] upperCh){

        for(int i=0 ; i<26; i++){

            if(currentLowerCh[i] >= lowerCh[i] && currentUpperCh[i] >= upperCh[i]){
                //System.out.println(i +"  "+ currentLowerCh[i]+"   " +currentUpperCh[i] +"  " +lowerCh[i] +" " +upperCh[i]);
            }else {
                return false;
            }
        }

        return  true;

    }
}