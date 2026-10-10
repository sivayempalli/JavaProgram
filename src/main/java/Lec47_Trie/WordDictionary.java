package Lec47_Trie;

import java.util.HashMap;
import java.util.Map;

class WordDictionary {

    class Node {
        char ch;
        boolean isTermnal;
        Map<Character, Node> child;

        Node(char ch){
            this.ch = ch;
            child = new HashMap<>();
        }
    }

    Node root;
    public WordDictionary() {
        root = new Node('*');
    }


    public void addWord(String word) {
        Node curr = root;

        for(int i=0; i<word.length(); i++){

            char c = word.charAt(i);
            if (curr.child.containsKey(c)){ //word of len 1, 2,3
                curr = curr.child.get(c);
            }else{
                Node childNode = new Node(c);
                curr.child.put(c, childNode);
                curr = childNode;
            }
        }

        curr.isTermnal = true;

    }

    private boolean searchTrie(Node curr, int pos, String word){

        if(pos == word.length()){
            return  curr.isTermnal;
        }

        char ch = word.charAt(pos);

        if(ch == '.'){

            if(curr.child.isEmpty()){
                return  false;
            }
            else{
                for(char c : curr.child.keySet()){
                    boolean found = searchTrie(curr.child.get(c),pos+1, word);
                    if (found){
                        return  true;
                    }
                }
                return  false;
            }

        }
        else if(curr.child.containsKey(ch)) {
            return  searchTrie(curr.child.get(ch), pos+1 , word);
        }
        else {
            return false;

        }

    }

    public boolean search(String word) {
        return  searchTrie(root , 0 , word);

    }
}