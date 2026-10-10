package Lec48;

public class Single_Number_III {
    public static void main(String[] args) {

    }
}

class Single_Number_III_Solution {
    public int[] singleNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum ^ nums[i];
        }



        int pos = 0;

        while (true) {

            if ((sum & (1<<pos)) != 0) {
                break;
            }

            pos++;
        }

        System.out.println(pos);

        int[] ans = new int[2];
        int ans1 = 0;
        int ans2 = 0;
        int mask = 1 << pos;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & mask) != 0) {
                ans1 = ans1 ^ nums[i];
            } else {
                ans2 = ans2 ^ nums[i];
            }
        }

        ans[0] = ans1;
        ans[1] = ans2;

        return ans;

    }
}
