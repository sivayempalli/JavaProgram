package LeetCode_150.BinaryTreeGeneral;

public class Construct_Binary_Tree_From_PostOrder_And_Inorder_Traversal {

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
        int curr = 0;
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            curr = postorder.length -1;
            return buildBinaryTree(postorder, inorder, 0, inorder.length-1);
        }

        public TreeNode buildBinaryTree(int[] postorder, int[] inorder, int low, int high){

            if(low > high){
                return  null;
            }

            TreeNode node =  new TreeNode(postorder[curr]);
            int currPos = findPos(inorder, postorder[curr]);
            curr = curr - 1;
            if(currPos == -1){
                return  null;
            }
            node.right = buildBinaryTree(postorder,inorder,currPos+1,high);
            node.left =  buildBinaryTree(postorder,inorder,low,currPos-1);

            return  node;

        }

        int findPos(int[] inorder, int val){
            for(int i=0; i<inorder.length; i++){
                if(inorder[i] == val){
                    return i;
                }
            }

            return -1;
        }
    }

}
