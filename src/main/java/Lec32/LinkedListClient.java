package Lec32;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.display();
        ll.addLast(50);
        ll.display();
    }
}
