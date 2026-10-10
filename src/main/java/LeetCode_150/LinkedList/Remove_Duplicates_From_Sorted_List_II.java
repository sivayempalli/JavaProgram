package LeetCode_150.LinkedList;

public class Remove_Duplicates_From_Sorted_List_II {
    public static void main(String[] args) {

    }

    public static class ListNode {
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

    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null){
            return  head;
        }

        ListNode resultHead = null;
        ListNode resultCurr = null;

        ListNode curr = head;
        ListNode prev = null;

        int duplicateVal = Integer.MIN_VALUE;

        while ( curr != null ){

            if(prev == null){
                prev = curr;
                curr = curr.next;
            }
            else{

                if(prev.val == curr.val){
                    prev.next = null;
                }
                else if(duplicateVal == prev.val){
                    prev.next = null;
                }
                else{

                    if(resultHead == null){
                        resultHead = prev;
                        resultCurr = prev;
                    }else{
                        resultCurr.next = prev;
                        resultCurr = prev;
                    }


                }

                duplicateVal = prev.val;
                prev = curr;
                curr = curr.next;

            }

        }

        if (prev.val != duplicateVal) {
            if (resultHead == null) {
                resultHead = prev;
                resultCurr = prev;
            } else {
                resultCurr.next = prev;
                resultCurr = prev;
            }
        }

        if(resultCurr != null) {
            resultCurr.next = null;
        }

        return  resultHead;

    }
}
