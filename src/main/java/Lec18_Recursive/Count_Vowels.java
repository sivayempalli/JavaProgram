package Lec18_Recursive;

public class Count_Vowels {
    public static void main(String[] args) {
        String s= "aeiousddfe";
        countVowels(s,0);
    }

    public static int countVowels(String s,int index){

        if(index >= s.length()){
            return 0;
        }

        char c = s.charAt(index);

        if(c == 'a' || c== 'e' || c== 'i' || c == 'o' || c == 'u'){
            return  1 + countVowels(s, index + 1);
        }
        else{
            return  countVowels(s, index  + 1);
        }

    }

}
