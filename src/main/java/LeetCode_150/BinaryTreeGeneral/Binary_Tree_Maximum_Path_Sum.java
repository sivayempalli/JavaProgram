package LeetCode_150.BinaryTreeGeneral;

public class Binary_Tree_Maximum_Path_Sum {

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

        int maxSum = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {

            findMaxPathSum(root);
            return  maxSum;
        }

        public int findMaxPathSum(TreeNode root ){

            if(root == null){
                return  0;
            }

            int leftDepthSum = findMaxPathSum(root.left);
            int rightDepthSum = findMaxPathSum(root.right);

            int currentSUm = root.val + leftDepthSum + rightDepthSum;

            int maxDepth =  Math.max(root.val ,Math.max(root.val + leftDepthSum , root.val + rightDepthSum ));

            maxSum = Math.max(maxDepth , Math.max(maxSum , currentSUm)); // forgot to include root

            return  maxDepth;


        }


    }
    
}
