package Lec15_AND_LEC16_String;

public class SubsString {
    public static void main(String[] args) {
        String s = "Coding";
        System.out.println(s.substring(2,5));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,2));
        System.out.println();

        s= "hello";
        for(int i=0; i< s.length(); i++){
            for(int j=i; j<s.length(); j++){
                System.out.println(s.substring(i,j+1));
            }
        }
    }
}
