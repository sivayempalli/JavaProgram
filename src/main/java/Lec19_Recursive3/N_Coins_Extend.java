package Lec19_Recursive3;

public class N_Coins_Extend {
    public static void main(String[] args) {
        int n = 4;
        coinsPossible(n , "");
    }

    public static void coinsPossible(int n , String result){

        if( n == 0){
            System.out.println(result);
            return;
        }

        if(result.isEmpty() || result.charAt(result.length()-1) == 'T') {
            coinsPossible(n-1, result + 'H');
        }
        coinsPossible(n-1,result + 'T');


    }

}
