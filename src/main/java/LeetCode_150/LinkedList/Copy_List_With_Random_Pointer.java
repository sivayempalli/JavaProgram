package LeetCode_150.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class Copy_List_With_Random_Pointer {
    public static void main(String[] args) {

    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    static class  Solution {
        public Node copyRandomList(Node head) {

            Map<Node , Node > map = new HashMap<>();

            Node headNew  = null;
            Node currNew = null;
            Node curr = head;

            while(head != null){

                Node newNode = new Node(head.val);
                if(headNew == null){
                    headNew = newNode;
                    currNew = newNode;
                }
                else{
                    currNew.next = newNode;
                    currNew = newNode;
                }

                map.put(head , newNode);

                head = head.next;
            }

            currNew = headNew;

            while(currNew != null){

                if(curr.random == null){
                    currNew.random = null;
                }
                else{
                    currNew.random = map.get(curr.random);
                }

                currNew = currNew.next;
                curr = curr.next;

            }
            return  headNew;
        }
    }
}
