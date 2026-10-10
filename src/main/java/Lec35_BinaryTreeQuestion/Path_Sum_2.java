package Lec35_BinaryTreeQuestion;

import java.util.List;

public class Path_Sum_2 {
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
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            return  null;
        }

//        public void hasPath(TreeNode root , int targetSum){
//
//            if(root == null){
//                return  false;
//            }
//
//            if(root.left == null && root.right == null){
//                if(root.val-targetSum == 0){
//                    return true;
//                }else {
//                    return  false;
//                }
//            }
//
//            boolean hasLeftPath = hasPathSum(root.left , targetSum - root.val);
//            boolean hasRightPath = hasPathSum(root.right , targetSum-root.val);
//
//            return  hasLeftPath || hasRightPath;
//
//        }
    }
}
