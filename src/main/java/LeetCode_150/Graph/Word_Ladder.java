package LeetCode_150.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Word_Ladder {
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {

            Queue<WordPair> queue = new LinkedList<>();
            HashSet<String> wordSet = new HashSet<>(wordList);
            HashSet<String> visited = new HashSet<>();

            queue.add(new WordPair(beginWord,0));

            while (!queue.isEmpty()){

                WordPair wp  = queue.poll();

                if(visited.contains(wp.word)){
                    continue;
                }

                visited.add(wp.word);

                if(wp.word.equals(endWord)){
                    return  wp.count;
                }

                System.out.print(wp.word+" ");
                for( int i=0; i< wp.word.length() ; i++){
                    char ch = wp.word.charAt(i);
                    for(int j=0; j<26; j++){

                        char nextChar = (char) ('a' + j);

                        if(ch != nextChar){

                            char[] newWordChar = wp.word.toCharArray();
                            newWordChar[i] = nextChar;
                            String newWord = new String(newWordChar);

                            if(wordSet.contains(newWord) && !visited.contains(newWord)){
                                System.out.print(newWord+"  ");
                                queue.add(new WordPair(newWord , wp.count + 1));
                            }
                        }

                    }

                }
                System.out.println();

            }

            return  0;

        }
    }

    class WordPair{

        String word;
        int count;

        WordPair(String word , int count){
            this.word = word;
            this.count = count;
        }

    }
}
