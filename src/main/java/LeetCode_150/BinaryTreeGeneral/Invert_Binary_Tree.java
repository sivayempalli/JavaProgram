package LeetCode_150.BinaryTreeGeneral;

public class Invert_Binary_Tree {
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
        public TreeNode invertTree(TreeNode root) {

            if(root == null){
                return root;
            }

            TreeNode left = invertTree(root.right);
            TreeNode right = invertTree(root.left);

            root.right = right;
            root.left = left;
            return  root;


        }
    }
}
