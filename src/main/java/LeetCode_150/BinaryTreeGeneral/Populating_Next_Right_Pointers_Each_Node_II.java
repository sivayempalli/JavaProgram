package LeetCode_150.BinaryTreeGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class Populating_Next_Right_Pointers_Each_Node_II {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    class Solution {
        public Node connect(Node root) {

            if(root == null){
                return  root;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                Node temp = null;
                int size = queue.size();

                for(int i=0 ; i<size; i++){

                    if(temp == null){
                        temp = queue.poll();
                    }else{
                        temp.next = queue.poll();
                        temp = temp.next;

                    }

                    if(temp != null && temp.left != null){
                        queue.add(temp.left);
                    }

                    if(temp != null && temp.right != null){
                        queue.add(temp.right);
                    }

                    temp.next = null;
                }
            }
            return  root;
        }
    }
}
