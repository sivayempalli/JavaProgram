package LeetCode_150.LinkedList;

public class Merge_Two_Sorted_Lists {
    public static void main(String[] args) {

    }

    private static  class ListNode {
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

}

class Merge_Two_Sorted_Lists_Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = null;
        ListNode curr = null;

        while(list1 != null && list2 != null){
            ListNode temp;
            if(list1.val  <= list2.val){
                temp = list1;
                list1 = list1.next;
            }else{
                temp = list2;
                list2 = list2.next;
            }

            if(head == null){
                head = temp;
                curr = temp;
            }else{
                curr.next = temp;
                curr = temp;
            }

        }

        if (list1 != null) {
            if(head == null){
                head = list1;
            }else{
                curr.next = list1;
            }
        }

        if (list2 != null) {
            if(head == null){
                head = list2;
            }else{
                curr.next = list1;
            }
        }


        return  head;

    }
}