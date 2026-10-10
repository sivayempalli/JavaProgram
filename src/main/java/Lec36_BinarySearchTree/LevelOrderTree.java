package Lec36_BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTree {

    private class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    private Node root;

    public  LevelOrderTree(){
        root = createNode();
    }

    private Node createNode(){
        Scanner sc = new Scanner(System.in);
        Queue<Node> q = new LinkedList<>();
        int val = sc.nextInt();
        Node node = new Node(val);
        q.add(node);

        while (!q.isEmpty()){
            Node root = q.poll();
            int leftVal = sc.nextInt();
            int rightVal = sc.nextInt();

            if(leftVal != -1){
                root.left = new Node(leftVal);
                q.add(root.left);
            }

            if(rightVal != -1){
                root.right = new Node(rightVal);
                q.add(root.right);
            }
        }
        return  node;
    }
}
