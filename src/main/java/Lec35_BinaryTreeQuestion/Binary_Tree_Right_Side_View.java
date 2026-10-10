package Lec35_BinaryTreeQuestion;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {
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
        int maxDepth = -1;

        public List<Integer> rightSideView(TreeNode root) {

            List<Integer> result = new ArrayList<>();
            rightView(root,0,result);
            return result;

        }

        public void rightView(TreeNode root,int currentDepth,List<Integer> result) {

            if(root == null){
                return;
            }

            if(currentDepth > maxDepth){
                result.add(root.val);
                maxDepth++;
            }

            rightView(root.left , currentDepth + 1,result);
            rightView(root.right , currentDepth + 1,result);

        }
    }
}
