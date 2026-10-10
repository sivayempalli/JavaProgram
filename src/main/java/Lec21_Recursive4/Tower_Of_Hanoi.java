package Lec21_Recursive4;

public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        TOH(3,"A","B","C");
    }

    public static void TOH(int n, String src , String helper , String des){

        if(n == 0){
            return;
        }
        TOH(n-1,src,des,helper);
        System.out.println("Move "+n+"th step from "+src+" to "+ des);
        TOH(n-1,helper,src,des);

    }
}
