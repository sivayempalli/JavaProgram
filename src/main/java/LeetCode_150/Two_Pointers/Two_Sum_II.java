package LeetCode_150.Two_Pointers;

public class Two_Sum_II {
    public static void main(String[] args) {
         int[] arr = new Two_Sum_II_Solution().twoSum(new int[] {2,7,11,15}, 9);
         for(int output : arr){
             System.out.println(output);
         }
    }
}

class Two_Sum_II_Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while(i < j) {

            if(numbers[i] + numbers[j] == target){
                return new int[]{i+1, j+1};
            }else if (numbers[i] + numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }

        return new int[]{-1,-1};
    }
}