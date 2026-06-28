package Lec19_Recursive2;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        List<String> results = new ArrayList<>();

        subSequenceRecursive(s,0, "",results);

        for(String result : results){
            System.out.println(result);
        }
    }

    public static void subSequenceRecursive(String s, int index , String sub, List<String> results){

        if(index == s.length()){
            results.add(sub);
            return;
        }

        subSequenceRecursive(s, index+1 ,sub,results);
        subSequenceRecursive(s, index+1 ,sub + s.charAt(index) ,results);
    }
}
