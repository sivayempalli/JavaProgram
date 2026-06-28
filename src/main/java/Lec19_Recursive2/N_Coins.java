package Lec19_Recursive2;

public class N_Coins {
    public static void main(String[] args) {
        int n = 3;
        coinsPossible(n , "");
    }

    public static void coinsPossible(int n , String result){

        if(result.length() == n){
            System.out.println(result);
            return;
        }

        coinsPossible(n,result + 'H');
        coinsPossible(n,result + 'T');


    }

}
