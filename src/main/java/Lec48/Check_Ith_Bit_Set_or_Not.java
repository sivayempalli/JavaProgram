package Lec48;

public class Check_Ith_Bit_Set_or_Not {
    public static void main(String[] args) {
        int num = 84;
        int pod = 4;
        //System.out.println( ( num&(1<<4) ) > 0 ? " Set " : " Unset " );
    }
    public static boolean Check_Ith_Bit(int n,int pos) {

        int mask = (1<<pos);

        if((n&mask) > 0){
            return  false;
        }else {
            return true;
        }

    }
}
