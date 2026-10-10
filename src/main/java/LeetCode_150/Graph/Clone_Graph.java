package LeetCode_150.Graph;

import java.util.*;

public class Clone_Graph {

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


    class Solution {
        public Node cloneGraph(Node node) {

            // create Node new Node, Map old node to new node (vertex compare node) , visted Node

            if(node == null){
                return node;
            }
            Node newNode = new Node(node.val);

            Map<Node,Node> map = new HashMap<>();
            HashSet<Node> visited = new HashSet<>();

            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()){

                Node temp = queue.poll();
                Node tempNewNode = map.get(temp);


                if(visited.contains(temp)){
                    continue;
                }

                visited.add(node);

                for(Node neighNode : temp.neighbors){
                    if(!map.containsKey(neighNode)){
                        map.put(neighNode , new Node(neighNode.val));
                    }

                    tempNewNode.neighbors.add(map.get(neighNode));

                    if(!visited.contains(neighNode)){
                        queue.add(neighNode);
                    }

                }


            }

            return  map.get(node);
        }
    }
}
