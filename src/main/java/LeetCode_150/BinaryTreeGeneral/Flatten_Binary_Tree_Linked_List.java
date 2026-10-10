package LeetCode_150.BinaryTreeGeneral;

public class Flatten_Binary_Tree_Linked_List {

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
        public void flatten(TreeNode root) {
            BT_LL(root);
        }

        TreeNode BT_LL(TreeNode root){

            if(root == null){
                return  null;
            }

            if(root.left == null && root.right == null){
                return  root;
            }

            TreeNode leftTail = BT_LL(root.left);
            TreeNode rightTail = BT_LL(root.right);

            if(leftTail != null) {
                leftTail.right = root.right;
                root.right = root.left;
                root.left = null;
            }

            return  rightTail != null ?   rightTail : leftTail;


        }
    }
    
}
