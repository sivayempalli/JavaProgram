package Lec45_GraphQuestion;

import java.util.HashMap;

public class DisJointSet {

    class Node {
        Node parent;
        int rank;
        int data;

        Node(int data){
            this.data  = data;
        }
    }

    HashMap<Integer,Node> map = new HashMap<>();

    public  void createSet(int v){
        Node n = new Node(v);
        n.rank = 0;
        n.parent = n;

    }

    public int find(int v){

        Node n = map.get(v);
        return find(n).data;
    }

    private Node find(Node nn){
        if(nn == nn.parent){
            return  nn;
        }
        nn.parent = find(nn.parent);
        return  nn.parent;
    }

    public void union(int v1, int v2){
        Node n1 = map.get(v1);
        Node n2 = map.get(v2);

        Node parentN1 = find(n1);
        Node parentN2 = find(n2);

        if(parentN2.rank == parentN1.rank){
            parentN2.parent = parentN1;
            parentN2.rank++;
        }else if(parentN2.rank < parentN1.rank){
            parentN2.parent = parentN1;
        }else{
            parentN1.parent = parentN2;
        }
    }


}
