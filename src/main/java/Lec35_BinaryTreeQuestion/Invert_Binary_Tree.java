package Lec35_BinaryTreeQuestion;

public class Invert_Binary_Tree {

    private class TreeNode {
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
        public boolean isSymmetric(TreeNode root) {
            return  isSymmetricTree(root.left ,  root.right);
        }

        public boolean isSymmetricTree(TreeNode leftNode , TreeNode rightNode){

            if(leftNode == null && rightNode == null){
                return  true;
            }

            if(leftNode == null || rightNode == null){
                return  false;
            }

            if(leftNode.val != rightNode.val){
                return false;
            }

            boolean left = isSymmetricTree(leftNode.left , rightNode.right);
            boolean right = isSymmetricTree(leftNode.right , rightNode.left);

            return  left&right;

        }
    }
}
