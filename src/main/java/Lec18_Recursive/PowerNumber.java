package Lec18_Recursive;

public class PowerNumber {
    public static void main(String[] args) {
        int a = 3;
        int n = 4;
        System.out.println(pow(3,4));
    }

    public static  int pow(int a , int n){

        if(n == 0){
            return 1;
        }

        return  a * pow(a, n-1);

    }
}
