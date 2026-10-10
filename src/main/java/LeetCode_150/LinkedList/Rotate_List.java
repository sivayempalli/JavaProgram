package LeetCode_150.LinkedList;

public class Rotate_List {
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

    public ListNode rotateRight(ListNode head, int k) {

        int size = 0;
        ListNode curr = head;
        ListNode last = null;
         while(curr != null){
            size++;
            last = curr;
            curr = curr.next;
        }

        int diff = ( size -  (k%size));

        if(diff == size){
            return  head;
        }

        curr = head;
        int currCount = 1;
        while(currCount < diff){
            curr = curr.next;
            currCount++;
        }

        ListNode prev = curr;
        curr = curr.next;



        prev.next = null;
        if(curr !=  last){
                last.next = head;
        }
        else {
            curr.next = head;
        }
        head = curr;

        return  head;

    }

}
