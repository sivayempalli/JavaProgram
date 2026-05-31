package LeetCode_150.Arrays_And_Sorting;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        System.out.println(new Longest_Common_Prefix_Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(new Longest_Common_Prefix_Solution().longestCommonPrefix(new String[]{"dog","racecar","car"}));

    }
}

class Longest_Common_Prefix_Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return  strs[0];
        }
        StringBuilder result = new StringBuilder();
        int minLen = Integer.MAX_VALUE;

        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        for(int i=0; i< minLen ; i++){
            char prefixChar = ' ';
            int count = 0;
            for(int j=0; j < strs.length ; j++){

                if(prefixChar == ' '){
                    prefixChar = strs[j].charAt(i);
                    count++;
                }
                else {

                    if (prefixChar == strs[j].charAt(i)){
                        count++;
                    }else{
                        break;
                    }
                }
            }
           // System.out.println(prefixChar + " "+ count);
            if(count == strs.length){
                result.append(prefixChar);
            }
            else{
                break;
            }
        }

        return result.toString();



    }
}
