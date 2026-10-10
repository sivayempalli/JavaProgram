package LeetCode_150.Bit_ManiPulation;

public class Add_Binary {
    public static void main(String[] args) {
        System.out.println(new Add_Binary_Solution().addBinary("1010","1011"));
        System.out.println(new Add_Binary_Solution().addBinary("11","1"));
    }
}

class Add_Binary_Solution {
    public String addBinary(String a, String b) {

        //a = "1010"
        //b = "1011"
        //c = "    0001"   xor extra bit :  1 1 0
        String result = ""; //use string buider concept


        int i = a.length() - 1;
        int j = b.length() - 1;
        int extraBit = 0;
        while (i >= 0 || j >= 0){

            int first =  (i>=0) ? (a.charAt(i) == '1' ? 1 : 0 ): 0;
            int second = (j>=0) ? (b.charAt(j) == '1' ? 1 : 0 ) : 0;

            int sum = first+second+extraBit;
            //System.out.println(first + "   "+ second+ "   "+sum);
            if(sum == 0){
                result = "0"+result;
                extraBit = 0;
            }else if( sum == 1){
                result = "1"+result;
                extraBit = 0;
            }else if(sum == 2){
                result = "0"+result;
                extraBit = 1;
            }else {
                result = "1"+result;
                extraBit = 1;
            }

            i--;
            j--;
        }

        if(extraBit == 1){
            result = "1" + result;
        }

        return  result;

    }
}