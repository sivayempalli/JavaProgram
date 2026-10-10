package Lec30;

public class Method_Overriding {

    //Compile Time
    public  int add(int a , int b){
        return  a + b;
    }

    public  int add(int a , int b, int c){
        return  a + b + c;
    }

    public  int add(int a , int b, double c){
        return (int) (a + b + c);
    }
}
