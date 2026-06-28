package LeetCode_150.Arrays_And_Sorting;

import java.util.ArrayList;
import java.util.List;

public class Text_Justification {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;

        for(String eachWord : new Text_Justification_Solution().fullJustify(words,maxWidth)){
            System.out.println(eachWord);
        }

    }
}

class Text_Justification_Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<StringBuilder> stringWords = new ArrayList<>();
        List<Integer> wordsPresent = new ArrayList<>();
        int currentLength = 0;
        int wordCount = 0;
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            if (currentLength == 0 && currentLength + word.length() <= maxWidth) {
                sb.append(word);
                currentLength = sb.length();
                wordCount++;
            } else if(currentLength != 0 && currentLength +  1 + word.length() <= maxWidth) {
                sb.append(" ");
                sb.append(word);
                currentLength = sb.length();
                wordCount++;
            }else{
                wordsPresent.add(wordCount);
                stringWords.add(sb);
                wordCount = 1;
                sb = new StringBuilder(word);
                currentLength = sb.length();
            }
        }

        if(currentLength != 0){
            stringWords.add(sb);
            wordsPresent.add(1);
        }

        for(StringBuilder s : stringWords){
            System.out.println(s);
        }

        for(Integer i : wordsPresent){
            System.out.println(i);
        }

        return  new ArrayList<>();


    }
}
