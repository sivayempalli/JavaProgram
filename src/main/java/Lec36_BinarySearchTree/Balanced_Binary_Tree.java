package Lec36_BinarySearchTree;

public class Balanced_Binary_Tree {

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

        private  class Node {
            int height = -1;
            boolean isBalanced = true;
        }

        public boolean isBalanced(TreeNode root) {

            return balanced(root).isBalanced;

        }

        public  Node balanced(TreeNode root){

            if (root == null){
                return  new Node();
            }

            Node ll = balanced(root.left);
            Node rt = balanced(root.right);

            Node current = new Node();
            current.height = Math.max(ll.height , rt.height) + 1;
            current.isBalanced = Math.abs(ll.height - rt.height ) <= 1;

            current.isBalanced =  current.isBalanced && ll.isBalanced && rt.isBalanced ;

            return  current;

        }
    }
}
