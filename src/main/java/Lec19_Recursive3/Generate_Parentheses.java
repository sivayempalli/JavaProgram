package Lec19_Recursive3;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Generate_Parentheses {
    public static void main(String[] args) {
        List<String> results = new Generate_Parentheses_Solution().generateParenthesis(3);
        for(String result : results){
            System.out.println(result);
        }
    }

}

class Generate_Parentheses_Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisRecursive("",0,0, n ,result);
        return  result;
    }

    public void generateParenthesisRecursive(String outCome,int openBracket, int closeBracket , int total, List<String> result ){

        //Base Case

        if(openBracket == total && closeBracket == total){
            result.add(outCome);
            return;
        }

        if(openBracket > total || closeBracket > total){
            return;
        }

        generateParenthesisRecursive(outCome + '(',openBracket+1, closeBracket,total,result);
        if(openBracket > closeBracket){
            generateParenthesisRecursive(outCome + ')',openBracket, closeBracket+1,total,result);
        }

    }
}
