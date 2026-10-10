package Lec36_BinarySearchTree;

public class Delete_Node_BST {

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
        public TreeNode deleteNode(TreeNode root, int key) {

            if(root == null){
                return  root;
            }

            if(root.val < key){
                return  root.right = deleteNode(root.right , key);
            }else if(root.val > key){
                return  root.left = deleteNode(root.left , key);
            }
            else {

                if(root.left == null){
                    return  root.right;
                }else if(root.right == null){
                    return  root.left;
                }else{
                    //
                    int maxVal = findMax(root.left);
                    deleteNode(root.left , maxVal);
                    root.val = maxVal;
                    return  root;
                }

            }
        }

        public int findMax(TreeNode treeNode){
            if(treeNode == null){
                return  Integer.MIN_VALUE;
            }
            return Math.max(treeNode.val , findMax(treeNode.right));
        }
    }
}
