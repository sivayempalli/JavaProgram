package Lec33_LinkedListQuestion;

public class Intersection_Of_Two_Linked_Lists {
    public static void main(String[] args) {

    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode currA = headA;
        ListNode currB = headB;
        while (currB != currA){

            if(currB == null){
                currB = headA;
            }else {
                currB = currB.next;
            }


            if(currA == null){
                currA = headB;
            }
            else {
                currA =currA.next;
            }

        }

        return  currA;


    }
}


