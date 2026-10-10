package LeetCode_150.Bit_ManiPulation;

public class Single_Number_II {
    public static void main(String[] args) {

    }
}

class Single_Number_II_Solution {
    public int singleNumber(int[] nums) {

        //GENERATE NUMBER
        int bit = 0;
        int result = 0;

        while(bit <= 31){

            int count = 0;
            for(int i=0; i<nums.length; i++){
                if((nums[i]&(1<<bit)) != 0){ // important
                    count++;
                }
            }

            System.out.println(count+"  "+(1<<bit)+"  "+bit);

            if(count%3 != 0){
                result = result + (1<<bit);
            }

            bit++;
        }

        return  result;

    }
}
