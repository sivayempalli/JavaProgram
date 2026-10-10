package Lec48;

public class SubSequnce_Without_Recursion {
    public static void main(String[] args) {
        String s = "abc";
        SubSequnce(s);
    }

    public  static void SubSequnce(String s){

        int len  = 1 << (s.length()) ;

        for(int i=0; i<len; i++){
            StringBuilder ans = new StringBuilder();
            int pos = 0;
            while(i > 0){
                if( (i&1) != 0 ){
                    ans.append(s.charAt(pos));
                }
                i = i>>1;
                pos++;
            }
            System.out.println(ans);



        }

    }
}
