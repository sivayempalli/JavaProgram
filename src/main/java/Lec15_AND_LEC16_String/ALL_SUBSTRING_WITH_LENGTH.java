package Lec15_AND_LEC16_String;

public class ALL_SUBSTRING_WITH_LENGTH {
    public static void main(String[] args) {
        String s = "Coding";

//        for(int len =1; len <= s.length(); len++){
//            for(int j=0; j < s.length() - len + 1 ; j++){
//                System.out.println(s.substring(j,j+len));
//            }
//        }

        for(int len =1; len <= s.length(); len++){
            for(int j=len; j <= s.length()  ; j++){
                int i = j-len;
                System.out.println(s.substring(i,j));
            }
        }

    }
}
