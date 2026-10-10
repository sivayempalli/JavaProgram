package Lec30;

import Lec2.Pattern9;

public class Client {
    public static void main(String[] args){
        //Case 1
        //P p = new P();
        //System.out.println(p.d);
        //p.fun();

        //Case 2
        P p = new C();
        System.out.println(p.d);
        System.out.println( ((C) p).d2 );
        System.out.println( ((C) p).d );
        ((C) p).fun2();

        //Case 3
        //C c = new P(); // not possible

        // Case 4
        C c = new C();
        System.out.println(c.d);
        c.fun();


    }
}
