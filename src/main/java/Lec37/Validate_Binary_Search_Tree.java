package Lec37;

public class Validate_Binary_Search_Tree {

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
        public boolean isValidBST(TreeNode root) {

            return  validBST(root).isBst;

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
            return  current;

        }

        class BSTPair{
            boolean isBst = true;
            Long min = Long.MAX_VALUE;
            Long max = Long.MIN_VALUE;
        }
    }
}
