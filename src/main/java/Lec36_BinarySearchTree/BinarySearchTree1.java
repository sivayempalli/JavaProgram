package Lec36_BinarySearchTree;

public class BinarySearchTree1 {

    private class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    private Node root;

    public  BinarySearchTree1(int[] in){
        root = createNode(in,0,in.length-1);
    }

    private Node createNode(int[] in ,int si, int ei){

        if(si > ei){
            return  null;
        }

        int mid = (si+ei)/2;
        Node n = new Node(in[mid]);
        n.left = createNode(in,si,mid-1);
        n.right = createNode(in, mid+1, ei);
        return n;
    }
}
