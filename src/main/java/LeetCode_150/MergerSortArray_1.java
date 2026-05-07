//package LeetCode_150;
//
//public class MergerSortArray_1 {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int[] nums1 = new int[]{1, 2, 5, 0, 0, 0};
//        int[] nums2 = new int[]{6,7,8};
//        int m = 3;
//        int n = 3;
//        s.merge(nums1,m,nums2,n);
////        for(int i = 0 ; i < m+n ; i++){
////            System.out.print(nums1[i]+" ");
////        }
//        for(int num: nums1){
//            System.out.print(num+" ");
//        }
//        System.out.println();
//    }
//}
//
//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        //Need to Traverse From Last to First
//        int size1 = m-1;
//        int size2 = n-1;
//        int size3 = m+n-1;
//
//        while(size2 >= 0 && size1 >= 0){
//            if(nums2[size2] >= nums1[size1]){
//                nums1[size3] = nums2[size2];
//                size3--;
//                size2--;
//            }else{
//                nums1[size3] = nums1[size1];
//                size3--;
//                size1--;
//            }
//        }
//
//        while(size2 >= 0){
//            nums1[size3] = nums2[size2];
//            size3--;
//            size2--;
//        }
//
//    }
//}
