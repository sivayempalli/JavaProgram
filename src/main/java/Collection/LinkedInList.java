package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedInList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(); //Dpuble Linked List
        ll.add("y1");
        ll.add("y2");
        ll.add(0,"y3");

        ArrayList<String> al = new ArrayList<>();
        al.add("s1");
        al.add("s2");

        ll.addAll(al);

        ll.remove("y2");

        System.out.println(ll);
        System.out.println(ll.get(0));

        ll.set(0,"y4");
        System.out.println(ll);

        System.out.println(Collections.synchronizedList(ll));

        for(String str : ll){
            System.out.println(str);
        }
    }
}
