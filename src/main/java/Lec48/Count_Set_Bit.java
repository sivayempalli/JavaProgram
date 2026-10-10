package Lec48;

public class Count_Set_Bit {
    //right shift and and operator
    // n & n-1
    public static void main(String[] args) {
        int n = 84;
        System.out.println(countbit(n));// TC-> O(log(N)) base 2
    }

    public static int countbit(int n){

        int count = 0;
        while (n > 0){
            n = (n&(n-1));
            count++;
        }
        return  count;
    }

    public static int countbit1(int n){

        int count = 0;
        while (n > 0){
            if( (n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return  count;
    }
}
