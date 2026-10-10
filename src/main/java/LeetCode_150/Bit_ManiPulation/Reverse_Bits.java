package LeetCode_150.Bit_ManiPulation;

public class Reverse_Bits {

}

class Reverse_Bits_Solution {
    public int reverseBits(int n) {

        int  bit =  31;
        int result = 0;

        while(n > 0){
            if(n%2 != 0){
                result += (1 << bit);
            }
            n = n/2;
            bit--;
        }

        return  result;

    }
}
