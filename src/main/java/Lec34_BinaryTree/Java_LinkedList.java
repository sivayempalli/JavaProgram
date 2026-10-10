package Lec34_BinaryTree;

import javax.xml.namespace.QName;
import java.util.LinkedList;
import java.util.Queue;

public class Java_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        System.out.println(ll);
        ll.addLast(3);
        ll.remove(1);
        System.out.println(ll);

        System.out.println("*********************************************************");

        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        System.out.println(queue.remove());


        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        System.out.println(queue1.poll()); // remove
        System.out.println(queue1.peek()); // get element
        System.out.println(queue1);



    }
}
