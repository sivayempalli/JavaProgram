package LeetCode_150.BinaryTreeGeneral;

import java.util.Stack;

public class Binary_Search_Tree_Iterator {

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

    class BSTIterator {

        Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {
            stack = new Stack<>();
            while(root != null){
                stack.push(root);
                root = root.left;
            }
        }

        public int next() {

            TreeNode node =  stack.pop();
            int val = node.val;

            node = node.right;
            while(node != null){
                stack.push(node);
                node = node.left;
            }

            return  val;

        }

        public boolean hasNext() {
            return  stack.isEmpty();
        }
    }
}
