package Lec7_Fun;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 6543;
        int armstrongNum = 0;
        int len = count_of_len(num);

        while(num > 0){
            armstrongNum = armstrongNum + (int)Math.pow(num%10, len);// powerNum(num%10,len);
            num = num/10;
        }
    }

    static int count_of_len(int num) {
        int len = 0;
        while (num > 0){
            len++;
            num = num/10;
        }
        return  len;
    }

    static int powerNum(int digit , int len) {
        int powN = 1;
        for(int i=0; i<len;i++ ){
            powN = powN * digit;
        }
        return  powN;
    }
}
