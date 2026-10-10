package LeetCode_150.LinkedList;

public class Remove_Nth_Node_From_End_Of_List {
    public static void main(String[] args) {

    }

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }

        int diff = size - n ;
        // System.out.println("     "+diff);

        curr = null;
        if(diff == 0 && size == 1){
            return  curr;
        }

        if(diff == 0){
            curr = head;
            curr = curr.next;
            head.next = null;
            head = curr;

            return  head;
        }

        curr = head;
        int currCount = 1;
        while(currCount < diff){
            //System.out.println(curr.val);
            curr = curr.next;
            currCount++;
        }

        ListNode prev = curr;
        //System.out.println(curr.val);
        curr = curr.next;
        //System.out.println(curr.val);



        prev.next = curr.next;
        curr.next = null;

        return  head;
    }
}
