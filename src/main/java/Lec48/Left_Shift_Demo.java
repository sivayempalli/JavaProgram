package Lec48;

public class Left_Shift_Demo {
    public static void main(String[] args) {
        int n = 5; // 32 bit
        System.out.println(n << 63);
        int n1 = -5;
        System.out.println(n1 << 2);
        int x = -5;
        System.out.println(x << -63);
    }
}
