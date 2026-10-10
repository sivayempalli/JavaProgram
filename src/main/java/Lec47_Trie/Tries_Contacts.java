package Lec47_Trie;

import java.util.HashMap;
import java.util.Map;

public class Tries_Contacts {
    class  Node {
        char ch;
        boolean isTerminal;
        int count;
        Map<Character, Node> child = new HashMap<>();

        Node(char ch){
            this.ch = ch;
            child = new HashMap<>();
            count = 1;
        }
    }

    Node root;

    Tries_Contacts(){
        root = new Node('*');
    }

    public void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(curr.child.containsKey(c)){
                curr.child.get(c).count++;
            }else{
                Node newChildNode = new Node(c);
                curr.child.put(c,newChildNode);
                curr = newChildNode;
            }
        }
        curr.isTerminal = true;
    }

    public int search(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(curr.child.containsKey(c)){
                curr = curr.child.get(c);
            }else{
               return  0;
            }
        }
        return  curr.count;
    }
}
