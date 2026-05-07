package MultiThreading;

public class FirstExample {
    public static void main(String[] args) {
        Employee t1 = new Employee("t1");
       // Thread t2 = new Thread();

        t1.start();
       // t2.start();

        System.out.println(Thread.activeCount());
        System.out.println(t1.getName());
        System.out.println(Thread.currentThread().getName());

    }
}

class Employee extends  Thread {

    public Employee(String tName){
        super(tName);
    }

    @Override
    public void run() {
        //super.run();
        System.out.println("Custom Thread");
    }
}
