package Lec18_Recursive;

public class SUM_N_Num {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumd(n));
    }

    public static int sumd(int n){

        if(n == 0){
            return 0;
        }

        return  n + sumd(n-1);

    }
}
