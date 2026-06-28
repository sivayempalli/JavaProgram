package Lec15_AND_LEC16_String;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("1220222");

        StringBuilder sb1 = new StringBuilder();
        sb1.append("1220222");
        System.out.println(sb1.equals(sb));

        System.out.println(sb.toString());
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
