package Lec27;

public class Student {
    String name;
    int age;

    void Intro_Yourself(){
        System.out.println("My name is "+name+" and age is : "+ age );
    }

    void Intro_Yourself(String name){
        System.out.println("My name is "+this.name+" and age is : "+ age );
    }

    static void  Mentor_Intro_Yourself(){
        System.out.println("My mentor name is monu sir " );
    }
    static {
        System.out.println("static block child 1");
    }
    static {
        System.out.println("static block child 2");
    }

}
