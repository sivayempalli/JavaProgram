package Lec15_AND_LEC16_String;

public class LexicographicalOrder {
    public static void main(String[] args) {
        String s1 = "raj";
        String s2 = "raj";
    }

    private static int lexiOrder(String s1, String s2){

        if(s1 == s2){
            return 0;
        }

        int minLen = Math.min(s1.length(), s2.length());

        for(int i=0; i<minLen; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return  s1.charAt(i) - s2.charAt(i);
            }
        }

        return  s1.length() - s2.length();

    }
}
