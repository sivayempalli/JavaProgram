package Lec47_Trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    class Node {
        char ch;
        boolean isTerminal;
        Map<Character,Node> childMap;

        Node(char ch){
            this.ch = ch;
            childMap = new HashMap<>();
        }
    }

    Node root ;

    Trie(){
        root = new Node('*');
    }

    public void  insert(String word){
        Node curr = root;

        for(int i=0; i<word.length(); i++){

            char c = word.charAt(i);
            if (curr.childMap.containsKey(c)){ //word of len 1, 2,3
                curr = curr.childMap.get(c);
            }else{
                Node childNode = new Node(c);
                curr.childMap.put(c, childNode);
                curr = childNode;
            }
        }

        curr.isTerminal = true;

    }

    public boolean search(String word) {

        Node curr = root;

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);

            if(curr.childMap.containsKey(c)){
                curr = curr.childMap.get(c);
            }
            else{
                return false;
            }
        }
        return  curr.isTerminal;
    }

    public boolean startsWith(String prefix) {

        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            char c = prefix.charAt(i);

            if(curr.childMap.containsKey(c)){
                curr = curr.childMap.get(c);
            }
            else{
                return false;
            }
        }
        return  true;

    }
}
