package Collection;

import java.util.Vector;

public class VectorAndArray {
    public static void main(String[] args) {
        //vector 100%
        //Arraylist 50% memory

        Vector v = new Vector<>();
        v.add("1");
        v.add("342");
        //add index

        Vector v1 = new Vector<>();
        v1.add("siva");
        v1.add("kumar");
        v1.addAll(v);
        System.out.println(v);
        System.out.println(v1);
    }
}
