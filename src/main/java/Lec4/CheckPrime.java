package Lec4;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                count++;
                break;
            }
        }

        if(count > 0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
