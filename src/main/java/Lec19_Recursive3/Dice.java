package Lec19_Recursive3;

public class Dice {
    public static void main(String[] args) {
        int n = 4;
        diceRoll(n,"");
    }

    public static void diceRoll(int n, String result){
        if(n < 0){
            return;
        }

        if(n == 0){
            System.out.println(result);
            return;
        }

        for(int i=1; i<=3; i++){
            diceRoll(n-i, result + i);
        }
    }
}
