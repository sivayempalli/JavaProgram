package LeetCode_150.LinkedList;

public class Partition_List {
    public static void main(String[] args) {

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

    private   static  ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return  head;
        }

        boolean elementFound  = false;
        ListNode curr = head;
        ListNode prev = null;
        ListNode foundNode = null;
        ListNode resultCurr = head;
        ListNode resultPrev = null;

        while(curr  != null){

                if(curr.val < x && curr != head){
                    foundNode = curr;
                    while(x > resultCurr.val && resultCurr != foundNode){
                        resultPrev = resultCurr;
                        resultCurr = resultCurr.next;
                    }

                    if(resultPrev != null) {
                        resultPrev.next = curr;
                    }else{
                        head = curr;
                    }
                    resultPrev = curr;
                    prev.next = curr.next;
                    curr.next = resultCurr;
                    curr = prev.next;



                }else{
                    prev = curr;
                    curr =curr.next;
                }


        }


        return  head;

    }
}
