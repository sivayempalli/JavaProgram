package LeetCode_150.LinkedList;

import java.util.Stack;

public class Reverse_Nodes_k_Group {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {

            Stack<ListNode> st = new Stack<>();

            ListNode dummy = new ListNode();
            ListNode temp  = dummy;
            ListNode start = head;

            while (head != null){
                st.push(head);
                head = head.next;

                if(st.size() == k){
                    //while
                    // 3 2 1
                    while (!st.isEmpty()){
                        ListNode  node = st.pop();
                        temp.next = node;
                        temp = node;
                    }

                    temp.next = null; // need to reverse node link
                    start = head;

                }

            }

            if(!st.isEmpty()){
                temp.next = start;
            }

            return  dummy.next;
        }
    }
}
