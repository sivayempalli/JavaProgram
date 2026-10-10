package LeetCode_150.Bit_ManiPulation;

public class Number_1_Bits {
    public static void main(String[] args) {

    }
}

class Number_1_Bits_Solution {
    public int hammingWeight(int n) {

        int count = 0;

        while(n > 0){

            if((n&1) ==1){
                count++;
            }

            n = n>>1;

        }

        return  count;

    }
}
