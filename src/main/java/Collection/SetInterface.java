package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

    public static void main(String[] args) {
        //Hash Set ==> Hash Map
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(4);
        hs.add(100);
        hs.add(49);
        hs.add(67);

        System.out.println(hs);

        System.out.println(hs.remove(1));
        System.out.println(hs.remove(3));
        System.out.println(hs.contains(100));

        for(Integer h : hs){
            System.out.println(h);
        }


        //Hash Set ==> linked hash map (maintain order) -> Link of order
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(54);

        System.out.println(linkedHashSet.size());

        System.out.println(linkedHashSet);

        //Tree Set --> tree Map --> binary tree
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(49);
        treeSet.add(67);
        treeSet.add(32);
        treeSet.add(54);
        treeSet.add(72);
        treeSet.add(6);





        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.subSet(4,100));

    }
}
