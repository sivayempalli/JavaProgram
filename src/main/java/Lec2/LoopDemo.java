package Lec2;

public class LoopDemo {
    public static void main(String[] args) {
        //while loop
        int n =5;
        int i =1;
        while(i < n){
            System.out.println("Hello");
            i = i +1 ;
        }

        i =1;
        int sum = 0;
        while(i<=10){
            sum= sum + i;
            i= i+1;
        }
        System.out.println("sum = "+ sum);
    }
}
