package Lec27;

public class StudentClient {
    public static void main(String[] args) {

        System.out.println("Hello World");

        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);

        student.name = "s";
        student.age = 12;

        System.out.println(student.name);
        System.out.println(student.age);

        student.Intro_Yourself();

        //this example


        //compile : javac
        //execute : java

    }

    static {
        System.out.println("static block");
    }
}
