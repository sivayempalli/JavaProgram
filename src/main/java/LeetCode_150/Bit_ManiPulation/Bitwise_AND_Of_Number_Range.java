package LeetCode_150.Bit_ManiPulation;

public class Bitwise_AND_Of_Number_Range {
    public static void main(String[] args) {

    }
}

class Bitwise_AND_Of_Number_Range_Solution {
    public int rangeBitwiseAnd(int left, int right) {

        while (right > left){
            right = right & (right-1);
        }

        return  right&left;

    }
}
