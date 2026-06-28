package Lec21_Recursive4;

public class Permutation1 {
    public static void main(String[] args) {
        perm("abc","");
    }

    public static void perm(String question, String ans){

        if(question.length() == 0){
            System.out.println(ans);
            return;
        }


        for(int i=0; i< question.length(); i++){
            char ch = question.charAt(i);
            String s1 = question.substring(0,i);
            String s2 = question.substring(i+1);
            perm(s1+s2, ans+ch);
        }

    }
}
