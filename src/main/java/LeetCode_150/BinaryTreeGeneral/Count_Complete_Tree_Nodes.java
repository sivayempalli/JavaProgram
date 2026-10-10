package LeetCode_150.BinaryTreeGeneral;

public class Count_Complete_Tree_Nodes {
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
        public int countNodes(TreeNode root) {

            if(root == null){
                return  0;
            }

            int leftCount = 0;
            int rightCount = 0;

            TreeNode left = root;
            while(left != null){
                leftCount++;
                left = left.left;
            }

            TreeNode right = root;
            while (right != null){
                rightCount++;
                right = right.right;
            }

            if(leftCount == rightCount){
                return  (1 << rightCount) - 1;
            }else{
                return  1 + countNodes(root.left) + countNodes(root.right);
            }

        }
    }
}
