package Lec15_AND_LEC16_String;

public class Example1 {
    public static void main(String[] args) {
        String s1 = "raj";
        String s2 = "raj";
        System.out.println(equalTo(s1,s2));
    }

    private static boolean equalTo(String s1, String s2){
        if(s1 == s2){
            return  true;
        }

        if(s1.length() != s2.length()){
            return  false;
        }

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return  false;
            }
        }

        return  true;
    }
}
