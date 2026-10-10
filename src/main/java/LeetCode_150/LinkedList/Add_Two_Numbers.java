package LeetCode_150.LinkedList;

public class Add_Two_Numbers {
    public static void main(String[] args) {

        ListNode head1 = new ListNode(2);
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(3);

        head1.next = l1;
        l1.next = l2;

        ListNode head2 = new ListNode(5);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(4);

        head2.next = l3;
        l3.next = l4;


        ListNode result = new Solution().addTwoNumbers(head1,head2);

        System.out.println(result);
        while (result != null){

            System.out.println(result.val);

            result = result.next;
        }

    }

    private static class ListNode {
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

    private static  class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            int carry = 0;
            ListNode result = null;
            ListNode head = null;

            while(l1 != null && l2 != null){

                int sum  = carry + l1.val + l2.val;
                ListNode node = new ListNode();
                node.val = sum%10;
                carry = sum/10;

                if(result == null){
                    result  = node;
                    head = node;
                }
                else{
                    result.next = node;
                    result = node;
                }

                l1 = l1.next;
                l2 = l2.next;
            }

            while (l1 != null){

                int sum  = carry + l1.val ;
                ListNode node = new ListNode();
                node.val = sum%10;
                carry = sum/10;

                if(result == null){
                    result  = node;
                    head = node;
                }
                else{
                    result.next = node;
                    result = node;
                }

                l1 = l1.next;
            }

            while (l2 != null){

                int sum  = carry + l2.val ;
                ListNode node = new ListNode();
                node.val = sum%10;
                carry = sum/10;

                if(result == null){
                    result  = node;
                    head = node;
                }
                else{
                    result.next = node;
                    result = node;
                }

                l2 = l2.next;
            }

            if(carry != 0){

                ListNode node = new ListNode();
                node.val = carry;

                if(result == null){
                    result = node;
                    head = node;
                }
                else{
                    result.next = node;
                    result = node;
                }

            }
            return head;
        }
    }
}

