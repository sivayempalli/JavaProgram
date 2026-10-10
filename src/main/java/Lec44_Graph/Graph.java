package Lec44_Graph;

import java.util.*;

public class Graph {

    private HashMap<Integer, HashMap<Integer, Integer> > map;

    public  Graph(int noOfVertices){
        map = new HashMap<>(noOfVertices);
        for(int i=1; i<=noOfVertices; i++){
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1,cost);
    }

    public boolean ContainsEdge(int v1, int v2) {
        return  map.get(v1).containsKey(v2);
    }

    public boolean Containsvertex(int v1) {
        return map.containsKey(v1);
    }

    public int number_of_Edge() {
        int edgeCount = 0;
        for(Integer v : map.keySet()){
            edgeCount += map.get(v).size();
        }

        return  edgeCount / 2;
    }

    public void removeEdge(int v1, int v2) {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removevertex(int v1) {
        for (Integer v : map.get(v1).keySet()) {
            map.get(v).remove(v1);
        }
        map.remove(v1);
    }

    public void Display() {

        for(int v1 : map.keySet()){
            for(int v2 : map.get(v1).keySet()){
                System.out.println("v1 : "+v1+" v1 : "+v2+" @cost : "+ map.get(v1).get(v2));
            }
        }
    }

    public boolean hashpath(int src, int des, HashSet<Integer> visited) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);

        while(!queue.isEmpty()){

            // remove
            int ele = queue.poll();
            //mark visit
            visited.add(ele);
            // operation

            if(ele == des){
                return true;
            }

            // corresponding
            for(int v1 : map.keySet()){
                if(!visited.contains(v1)){
                    queue.add(v1);
                }
            }

        }

        return  false;
    }

    public boolean hashpath1(int src, int des, HashSet<Integer> visited) {
        if (src == des) {
            return true;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = hashpath1(nbrs, des, visited);
                if (ans) {
                    return true;
                }
            }

        }
        return false;

    }

    public void PrintPath(int src, int des, HashSet<Integer> visited, String ans) {
        //recursive approach
        if(src == des){
            System.out.println();
            return;
        }

        visited.add(src);
        for(Integer ver : map.get(src).keySet()){
            if(!visited.contains(ver)) {
                PrintPath(ver, des, visited, ans + ver);
            }
        }
        visited.remove(src);
    }

    public boolean BFS(int src, int des) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        queue.add(src);
        while (!queue.isEmpty()){
            //removed
            int vertx = queue.poll();

            //alrready visit or not
            if(visited.contains(vertx)){
                continue;
            }

            //mark visit
            visited.add(vertx);

            //logic

            if(vertx == des){
                return  true;
            }

            //add neighbor
            for(int v : map.get(vertx).keySet()){
                if(!visited.contains(v)) {
                    queue.add(v);
                }
            }
        }

        return  false;

    }

    public boolean DFS(int src, int des) {

        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();

        st.push(src);
        while (!st.isEmpty()){
            //removed
            int vertx = st.pop();

            //alrready visit or not
            if(visited.contains(vertx)){
                continue;
            }

            //mark visit
            visited.add(vertx);

            //logic

            if(vertx == des){
                return  true;
            }

            //add neighbor
            for(int v : map.get(vertx).keySet()){
                if(!visited.contains(v)) {
                    st.push(v);
                }
            }
        }

        return  false;
    }

    public void BFT()  { // multi  graph present
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        for(Integer v : map.keySet()) {

            if(visited.contains(v)){
                continue;
            }

            queue.add(v);
            while (!queue.isEmpty()) {
                //removed
                int vertx = queue.poll();

                //alrready visit or not
                if (visited.contains(vertx)) {
                    continue;
                }

                //mark visit
                visited.add(vertx);

                //logic
                System.out.print(v+" -> ");

                //add neighbor
                for (int v1 : map.get(vertx).keySet()) {
                    if (!visited.contains(v1)) {
                        queue.add(v1);
                    }
                }
            }
            System.out.println();
        }

    }


}
