package Lec47_Trie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Replace_Words {



    class Solution {
        Node root = new Node('*');

        public String replaceWords(List<String> dictionary, String sentence) {

            for(String word : dictionary){
                insert(word);
            }
            String[] sentenceWords = sentence.split(" ");
            StringBuilder result = new StringBuilder();
            for(String word : sentenceWords){
                result.append(search(word));
                result.append(" ");
            }
            return  result.toString().trim();
        }

        public String search(String word){
            Node curr = root;
            for(int i=0; i<word.length(); i++){
                char c = word.charAt(i);
                if(curr.childNode.containsKey(c)){

                    if(!curr.childNode.get(c).prefix.isEmpty()){
                        return  curr.childNode.get(c).prefix;
                    }

                    curr = curr.childNode.get(c);
                }
                else{
                    return word;
                }
            }
            return  word;
        }

        public void insert(String word){
            Node curr = root;
            for(int i=0; i<word.length(); i++){
                char c = word.charAt(i);
                if(curr.childNode.containsKey(c)){
                    curr = curr.childNode.get(c);
                }
                else{
                    Node nn = new Node(c);
                    curr.childNode.put(c,nn);
                    curr = nn;
                }
            }
            curr.prefix = word;

        }
    }

    class Node {
        char ch;
        //boolean isTeminal;
        String prefix;
        Map<Character, Node> childNode;

        Node(char ch){
            this.ch = ch;
            childNode = new HashMap<>();
        }
    }
}
