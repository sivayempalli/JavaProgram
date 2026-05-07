package MultiThreading;

public class SecondExample {
    public static void main(String[] args) {

        //In Java,we can extend one implements many
        Employee1 employee1 = new Employee1();
        Thread t1 = new Thread(employee1);
        t1.start();


    }
}

class Employee1 implements Runnable {
    @Override
    public void run() {
        //super.run();
        System.out.println("Custom Thread");
    }
}
