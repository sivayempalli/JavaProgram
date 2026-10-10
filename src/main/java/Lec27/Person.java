package Lec27;

public class Person {

    //memory allocation , parsing , constructor

    //private public default protected
    private  String name = "Siva";
    private int age = 2;

    //Encapsulation

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if(age < 0){
                throw new Exception("age cant negative");
            }
            this.age = age;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }


}
