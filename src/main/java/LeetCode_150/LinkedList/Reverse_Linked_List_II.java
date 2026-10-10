package LeetCode_150.LinkedList;

public class Reverse_Linked_List_II {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode head = reverseBetween(l1,2,5);

        while (head != null){
            System.out.println( head.val +"  ");
            head = head.next;
        }

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

    public  static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode prev = null;

        int count = 1;
        while (count < left) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        //ListNode last = funReverse(curr, left, right);

        ListNode prevRev = null;
        ListNode currRev = curr;

        while (left <= right) {

            ListNode aHead = curr.next;
            curr.next = prevRev;
            prevRev = currRev;
            currRev = aHead;

            left++;
        }

        if (prev != null) {
            prev.next = prevRev;
        }
        else {
            head = prevRev;
        }

        curr.next = currRev;

        return head;
    }

//    static  ListNode  funReverse(ListNode head, int left, int right) {
//        ListNode prev = null;
//        ListNode curr = head;
//
//        while (left <= right) {
//
//            ListNode aHead = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = aHead;
//
//            left++;
//        }
//
//        return  curr;
//
//    }

//        ListNode listNodeLeftLeft = null;
//        ListNode listNodeLeftRight = null;
//        ListNode listNodeRightLeft = null;
//        ListNode listNodeRightRight = null;
//        ListNode listNodeLeft = null;
//        ListNode listNodeRight = null;
//
//        if(head.next == null){
//            return  head;
//        }
//
//        int pos = 1;
//        ListNode curr = head;
//        while (curr != null){
//
//            if(pos == left - 1){
//                listNodeLeftLeft = curr;
//            }
//            if(pos == left){
//                listNodeLeftRight = curr.next;
//                listNodeLeft = curr;
//            }
//            if(pos == right - 1){
//                listNodeRightLeft = curr;
//            }
//            if(pos == right){
//                listNodeRightRight = curr.next;
//                listNodeRight = curr;
//            }
//
//            pos = pos + 1;
//            curr = curr.next;
//        }
//
//        System.out.println(listNodeLeftLeft+" "+listNodeLeft+" "+listNodeLeftRight);
//        System.out.println(listNodeRightLeft+" "+listNodeRight+" "+listNodeRightRight);
//
//       // (rl , l)1 -> 2(lr , r)
//
//        if(listNodeLeftLeft != null){
//            listNodeLeftLeft.next = listNodeRight;
//        }
//
//        if(listNodeLeftRight != null && listNodeLeftRight != listNodeRight){
//            listNodeRight.next = listNodeLeftRight;
//        }else{
//            listNodeRight.next = listNodeLeft;
//        }
//
//        if(listNodeRightLeft != null && listNodeRightLeft != listNodeLeft){
//            listNodeRightLeft.next = listNodeLeft;
//        }
//
//        if(listNodeRightRight != null){
//            listNodeLeft.next = listNodeRightRight;
//        }
//        else{
//            listNodeLeft.next = null;
//        }
//
//        if(left == 1){
//            head = listNodeRight;
//        }
//
//        return  head;

//    }
}
