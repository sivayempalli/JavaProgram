package Lec15_AND_LEC16_String;

public class GoodString {
    public static void main(String[] args) {
        String s = "aeiogkjncvnkjnckjkfnnccxnaeiounvnkjnbbfbdb";
        System.out.println();
    }
    private  static  int maxVowelSunString(String s){
        int maxLen = 0;
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                count++;
                maxLen = Math.max(maxLen, count);
            }else{
                count = 0;
            }

        }
        return  maxLen;
    }

    private static boolean isVowel(char c){
        if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return  true;
        }
        return  false;
    }


}
