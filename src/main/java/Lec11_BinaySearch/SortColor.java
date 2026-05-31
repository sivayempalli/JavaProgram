package Lec11_BinaySearch;

public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,1,2,0,1,2,0};
        SortColor_Solution sortColorSolution = new SortColor_Solution();
        sortColorSolution.sortColors(nums);
        for (int num : nums){
            System.out.print(num);
        }
        System.out.println();

    }
}

class SortColor_Solution {
    public void sortColors(int[] nums) {

        int zero = 0;
        int two = nums.length - 1;

        int i = 0;

        while(i <= two){

            if (nums[i] == 0){
                nums[zero] = nums[i] + nums[zero] - (nums[i] = nums[zero]);
                zero++;
                i++;
            }
            else if(nums[i] == 2){
                nums[two] = nums[i] + nums[two] - (nums[i] = nums[two]);
                two--;
            }
            else {
                i++;
            }

        }

    }
}
