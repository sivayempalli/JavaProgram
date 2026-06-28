package Lec15_AND_LEC16_String;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        //stringBuilder();
        string();
    }

    private  static void stringBuilder(){
        StringBuilder sb= new StringBuilder();
        for(int i=0; i< 1000_100; i++){
            sb.append(i);
        }
        System.out.println(sb);

    }

    private  static void string(){
        String s = "";
        for(int i=0; i< 1000_100; i++){
            s =s + i;
        }
        System.out.println(s);

    }
}
