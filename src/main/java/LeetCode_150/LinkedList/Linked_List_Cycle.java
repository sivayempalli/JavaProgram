package LeetCode_150.LinkedList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Linked_List_Cycle {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;

        System.out.println(new Linked_List_Cycle_Solution().hasCycle(l1));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}



class Linked_List_Cycle_Solution {

    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return  true;
            }
        }

        return  false;

//        if(head == null || head.next == null){
//            return  false;
//        }
//
//        Set<ListNode> visit = new HashSet<>();
//
//        while (head.next != null){
//            if(visit.contains(head)){
//                return true;
//            }
//            visit.add(head);
//            head = head.next;
//        }
//        return  false;

    }
}