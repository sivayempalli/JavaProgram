package Lec33_LinkedListQuestion;

public class Sort_List {
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
        public ListNode sortList(ListNode head) {

            if(head == null || head.next == null){
                return head;
            }

            ListNode mid = findMid(head);
            ListNode midNextNode = mid.next;
            mid.next = null;
            ListNode node1 = sortList(head);
            ListNode node2 = sortList(midNextNode);
            return  mergeNode(node1 , node2);
        }

        private  ListNode mergeNode(ListNode node1, ListNode node2){
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;

            while(node1 != null && node2 != null){

                if (node1.val > node2.val){
                    dummy.next = node2;
                    dummy = node2;
                    node2 = node2.next;
                    
                }else{
                    dummy.next = node1;
                    dummy = node1;
                    node1 = node1.next;
                }
            }

            if(node1!= null){
                dummy.next = node1;
            }

            if(node2 != null){
                dummy.next = node2;
            }

            return  temp.next;
        }


        private ListNode findMid(ListNode head){

            ListNode slow = head;
            ListNode fast = head;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
    }

}
