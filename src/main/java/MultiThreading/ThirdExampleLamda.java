package MultiThreading;

public class ThirdExampleLamda {
    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello "+ Thread.currentThread().getName()+" "+ Thread.currentThread().getState());
            }
        };

        Runnable r2 = () -> System.out.println("Hi "+ Thread.currentThread().getName()+" "+ Thread.currentThread().getState());

        Thread t1= new Thread(r1,"T1");
        Thread t2 = new Thread(r2,"T2");
        t1.start();
        t1.join();
        t1.sleep(1000);
        t2.start();

    }
}
