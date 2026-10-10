package LeetCode_150.Binary_Search_Tree;

/*
public int getMinimumDifference(TreeNode root) {

        Deque<TreeNode> stack = new ArrayDeque<>();

        Integer prev = null;
        int minDiff = Integer.MAX_VALUE;

        while (root != null || !stack.isEmpty()) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();

            if (prev != null) {
                minDiff = Math.min(minDiff, root.val - prev);
            }

            prev = root.val;

            root = root.right;
        }

        return minDiff;
    }


*/

public class Minimum_Absolute_Difference_BST {
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
        //int minDiff = Integer.MAX_VALUE;
        public int getMinimumDifference(TreeNode root) {
            Pair p = getMinDifference(root);
            return p.minDiff;
        }

        public Pair getMinDifference(TreeNode root) {

            if(root == null){
                return new Pair();
            }

            if(root.left == null && root.right == null){
                return new Pair(Integer.MAX_VALUE , root.val, root.val);
            }

            Pair leftPair = getMinDifference(root.left);
            Pair rightPair = getMinDifference(root.right);

            Pair result = new Pair();

            result.minVal = Math.min(leftPair.minVal, root.val);
            result.maxVal = Math.max(root.val,rightPair.maxVal);
            result.minDiff = Math.min(leftPair.minDiff, Math.min(rightPair.minDiff , Math.min( leftPair.maxVal == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math.abs(root.val - leftPair.maxVal)   , Integer.MIN_VALUE == rightPair.maxVal ? Integer.MAX_VALUE :  Math.abs(rightPair.minVal - root.val) )));

            return  result;
//            minDiff = Math.min( minDiff , Math.abs(root.val - Math.min(leftMin , rightMin)));
//
//            return Math.min(leftMin , Math.min(rightMin , root.val ));

        }

        class Pair {
            int minDiff = Integer.MAX_VALUE;
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;

            Pair(){

            }

            Pair(int minDiff ,int minVal , int maxVal){
                this.minDiff = minDiff;
                this.minVal = minVal;
                this.maxVal = maxVal;
            }
        }
    }
}
