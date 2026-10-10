package Lec36_BinarySearchTree;

public class Diameter_Binary_Tree {
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
        public int diameterOfBinaryTree(TreeNode root) {
            return  diameterOfBinaryTreeA(root).diamater;
        }

        class Node {
            int height = -1;
            int diamater = 0;
        }

        public Node diameterOfBinaryTreeA(TreeNode root){

            if(root == null){
                return  new Node();
            }

            Node ll = diameterOfBinaryTreeA(root.left);
            Node rt = diameterOfBinaryTreeA(root.right);

            Node currentRoot = new Node();
            currentRoot.height = Math.max(ll.height,rt.height) + 1;
            currentRoot.diamater = ll.height +rt.height + 2;
            currentRoot.diamater = Math.max(ll.diamater , Math.max(rt.diamater, currentRoot.diamater) );
            return  currentRoot;

        }
    }
}
