package Lec47_Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Word_Search_II {

    class Node {
        char ch;
        String isTerminal;
        Map<Character, Node> childMap;

        Node(char ch){
            this.ch = ch;
            childMap = new HashMap<>();
        }
    }

    class Solution {

        Node root;

        public List<String> findWords(char[][] board, String[] words) {

            // keep words in tries
            // use brack tracking  . to checking  word present in board or not
            //  (i,j) check start char present or not / if present follow tres word in four direction

            root = new Node('*');

            for(String word : words){
                insert(word);
            }

            //for
              //for
                 // if first char present  and start find word visited matric needed already visited ot not

            int m = board.length;
            int n = board[0].length;
            boolean[][] visited = new boolean[m][n];
            List<String> results = new ArrayList<>();
            Node curr = root;
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board[i].length; j++){
                    backTrack(curr, board, i, j, visited,results);
                }
            }
            return  results;
        }

        public void backTrack(Node curr , char[][] board, int row , int col , boolean[][] visited , List<String> result){


            char c = board[row][col];
            int m = board.length;
            int n = board[0].length;
            if(curr.childMap.containsKey(c)){

                if(curr.childMap.get(c).isTerminal != null){
                    result.add(curr.childMap.get(c).isTerminal);
                    curr.childMap.get(c).isTerminal = null;
                }

                int[] xAxis = {-1,0,1,0};
                int[] yAxis = {0,-1,0,1};

                visited[row][col] = true;
                for(int i=0; i< xAxis.length; i++){

                    int nextXAxis = row + xAxis[i];
                    int nextYAxis = col + yAxis[i];

                    if(nextXAxis >= 0 && nextXAxis < m && nextYAxis >= 0 && nextYAxis< n && !visited[nextXAxis][nextYAxis]){
                        backTrack(curr.childMap.get(c), board , nextXAxis, nextYAxis, visited, result);
                    }
                }
                visited[row][col] = false;

            }else{

            }



        }

        public void  insert(String word){
            Node curr = root;

            for(int i=0; i<word.length(); i++){

                char c = word.charAt(i);
                if (curr.childMap.containsKey(c)){ //word of len 1, 2,3
                    curr = curr.childMap.get(c);
                }else{
                    Node childNode = new Node(c);
                    curr.childMap.put(c, childNode);
                    curr = childNode;
                }
            }

            curr.isTerminal = word;

        }
    }


}
