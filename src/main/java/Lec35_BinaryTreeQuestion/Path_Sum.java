package Lec35_BinaryTreeQuestion;

public class Path_Sum {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            return  hasPath(root,targetSum);

        }

        public boolean hasPath(TreeNode root , int targetSum){

            if(root == null){
                return  false;
            }

            if(root.left == null && root.right == null){
                if(root.val-targetSum == 0){
                    return true;
                }else {
                    return  false;
                }
            }

            boolean hasLeftPath = hasPathSum(root.left , targetSum - root.val);
            boolean hasRightPath = hasPathSum(root.right , targetSum-root.val);

            return  hasLeftPath || hasRightPath;

        }
    }
}
