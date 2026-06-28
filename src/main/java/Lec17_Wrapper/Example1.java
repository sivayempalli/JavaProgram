package Lec17_Wrapper;

public class Example1 {
    public static void main(String[] args) {
        Integer a1 = 10;
        int a2 = 10;
        System.out.println(a1 == a2);

        Character c = 'a';
        Long l = 999L;

        a1 = a2;// Auto Boxing
        System.out.println(a1);

        a2 = a1; //Un Boxing
        System.out.println(a2);

        Integer b1 = 10;
        Integer b2 = 10;
        Integer b3 = 190;
        Integer b4 = 190;
        System.out.println(b1 == b2);
        System.out.println(b3 == b4);
        System.out.println(b3.equals(b4));



    }
}
