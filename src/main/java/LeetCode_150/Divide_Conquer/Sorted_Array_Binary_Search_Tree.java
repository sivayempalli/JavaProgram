package LeetCode_150.Divide_Conquer;

public class Sorted_Array_Binary_Search_Tree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return  BuildBST(nums, 0 , nums.length-1);
        }

        TreeNode BuildBST(int[] nums , int startIndex , int endIndex){

            if(startIndex > endIndex){
                return  null;
            }

            int mid = startIndex + ( (endIndex-startIndex)/2 ) ;

            TreeNode root = new TreeNode(nums[mid]);
            root.left = BuildBST(nums, startIndex , mid-1);
            root.right = BuildBST(nums,mid+1, endIndex);
            return  root;

        }
    }

}

