package Lec21_Recursive4;

public class PermutationRepeated {
    public static void main(String[] args) {
        perm("abca","");
    }

    public static void perm(String question, String ans){

        if(question.isEmpty()){
            System.out.println(ans);
            return;
        }


        for(int i=0; i< question.length(); i++){
            char ch = question.charAt(i);
            if(findCharInNextIndexString(i+1,ch,question)){
                continue;
            }
            String s1 = question.substring(0,i);
            String s2 = question.substring(i+1);
            perm(s1+s2, ans+ch);
        }

    }

    public static  boolean findCharInNextIndexString(int indx , char ch , String question){
        for(int i = indx; i < question.length(); i++ ){
            if(question.charAt(i) == ch){
                return  true;
            }
        }

        return  false;
    }


}

