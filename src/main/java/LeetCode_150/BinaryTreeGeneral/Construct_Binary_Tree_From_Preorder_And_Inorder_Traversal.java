package LeetCode_150.BinaryTreeGeneral;

public class Construct_Binary_Tree_From_Preorder_And_Inorder_Traversal {
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return buildBinaryTree(preorder, inorder, 0, inorder.length-1);
        }

        public  TreeNode buildBinaryTree(int[] preorder, int[] inorder, int low, int high){

            if(low > high || curr >= preorder.length){
                return  null;
            }

            //System.out.println(low+" "+high+"  "+curr+"  "+preorder[curr]);

            TreeNode node =  new TreeNode(preorder[curr]);
            int currPos = findPos(inorder, preorder[curr]);
            curr = curr + 1;

            if(currPos == -1){
                return  null;
            }
            node.left =  buildBinaryTree(preorder,inorder,low,currPos-1);
            node.right = buildBinaryTree(preorder,inorder,currPos+1,high);
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
