package LeetCode_150.Binary_Search_Tree;

public class Kth_Smallest_Element_BST {
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
        int pos = 0;
        public int kthSmallest(TreeNode root, int k) {
            if(root == null){
                return -1;
            }

            int found = kthSmallest(root.left, k);

            if(found != -1){
                return  found;
            }

            if(k == pos){
                return  root.val;
            }
            pos++;

           found =  kthSmallest(root.right, k);

            if(found != -1){
                return  found;
            }

            return  -1;

        }
    }
}
