package Lec21_Recursive4;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Numbers {
    public static void main(String[] args) {

        List<Integer> outputs = new Lexicographical_Numbers_Solution().lexicalOrder(13);
        for(Integer ouput : outputs){
            System.out.println(ouput);
        }

    }
}

class Lexicographical_Numbers_Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> results = new ArrayList<>();
        lexiPermuatation(0,n,results);
        return  results;
    }

    public void lexiPermuatation(int curr,int n, List<Integer> results){

        if(curr  > n){
            return;
        }

        if(curr != 0){
            results.add(curr);
        }


        int i = 0;
        if(curr == 0){
            i = 1;
        }

        for( ; i<=9; i++){
             lexiPermuatation(curr * 10 + i, n , results);
        }


    }
}
