package Lec37;

public class Maximum_Sum_BST_Binary_Tree {
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
        public int maxSumBST(TreeNode root) {
            return  validBST(root).ans;
        }

        public BSTPair validBST(TreeNode root) {

            if(root == null){
                return  new BSTPair();
            }

            BSTPair left = validBST(root.left);
            BSTPair right = validBST(root.right);

            BSTPair current = new BSTPair();
            current.isBst = (left.max <= root.val && right.min >= root.val) && left.isBst && right.isBst;
            current.min = Math.min(Math.min(left.min, right.min), root.val);
            current.max= Math.max(Math.max(right.max, left.max), root.val);
            current.sum = left.sum + right.sum + root.val;
            if(current.isBst){
                current.ans = Math.max(current.ans , Math.max(left.ans, right.ans));
            }
            else{
                current.ans = Math.max(left.ans, right.ans);
            }
            return  current;

        }

        class BSTPair{
            boolean isBst= true;
            int sum = 0;
            int ans = 0;
            Long min = Long.MAX_VALUE;
            Long max = Long.MIN_VALUE;
        }
    }
}
