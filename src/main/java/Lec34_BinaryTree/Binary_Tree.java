package Lec34_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {


    private class Node {
        private int val;
        private Node left;
        private  Node right;

        private Node(int val) {
            this.val = val;
        }
    }

    Node root;
    Scanner sc = new Scanner(System.in);

    public Binary_Tree() {
        root  = this.createNode();
    }

    private  Node createNode(){
        int val = sc.nextInt();
        Node nn = new Node(val);

        boolean hnl = sc.hasNext();

        if(hnl){
            nn.left = createNode();
        }

        boolean hnr = sc.hasNext();

        if(hnr){
            nn.right = createNode();
        }
        return nn;
    }

    public int findMax(){
        return findMax(root);
    }

    private int findMax(Node root){

        if(root == null){
            return  Integer.MIN_VALUE;
        }

        return Math.max(root.val, Math.max(findMax(root.left), findMax(root.right)));
    }

    private boolean findEle(Node root, int item){

        if(root == null){
            return  false;
        }

        if(root.val == item ){
            return  true;
        }

        if(findEle(root.left, item)){
            return  true;
        }

        return findEle(root.right, item);

    }

    //Height : max distance berween root and any leaf
    private int height(Node root){

        if(root == null){
            return  -1;
        }

        return  Math.max(height(root.left), height(root.right)) + 1;

    }

    //traverse
    //preOrder : root left right
    //InOrder : left root right
    //post : left right root

    private void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);

    }
    private void ineOrder(Node root){
        if(root == null){
            return;
        }


        ineOrder(root.left);
        System.out.println(root.val);
        ineOrder(root.right);

    }
    private void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);

    }

    private void levelOrder(){
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);

        while(!queue.isEmpty()){

            Node currentNode = queue.poll();
            System.out.print(currentNode.val + "-> ");
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }

    }


}
