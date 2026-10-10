package LeetCode_150.Binary_Tree_BFS;

import java.util.*;

public class Binary_Tree_Zigzag_Level_Order_Traversal {
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

            List<List<Integer>> result = new ArrayList<>();

            if(root == null){
                return result;
            }

            Deque<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int level = 0;

            while (!queue.isEmpty()){
                level++;
                List<Integer> levelResult = new ArrayList<>();
                int size = queue.size();
                for(int i=0; i<size; i++){


                    if(level%2 != 0) {

                        TreeNode node = queue.pollFirst();
                        levelResult.add(node.val);
                        if (node.left != null) {
                            queue.addLast(node.left);
                        }
                        if (node.right != null) {
                            queue.addLast(node.right);
                        }

                    }else {

                        TreeNode node = queue.pollLast();
                        levelResult.add(node.val);
                        if (node.right != null) {
                            queue.addFirst(node.right);
                        }
                        if (node.left != null) {
                            queue.addFirst(node.left);
                        }

                    }
                }
                result.add(levelResult);
            }

            return  result;
        }
    }

}
