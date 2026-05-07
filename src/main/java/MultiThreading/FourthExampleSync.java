package MultiThreading;

public class FourthExampleSync {
    public static void main(String[] args) throws InterruptedException {
        //Race Condition
        //Dead lock

        BrickCount bc = new BrickCount();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i< 100000;i+=50){
                    bc.updateBrickCout(50);
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i< 50000;i+=50){
                    bc.updateBrickCout(50);
                }
            }
        };

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i< 150000;i+=50){
                    bc.updateBrickCout(50);
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Total Brick : " + bc.totalCount);
    }
}

class BrickCount {
    int totalCount = 0;


    //Synchronize ==> useful for update or violatile => useful in get not for update
//    synchronized void  updateBrickCout(int count){
//        totalCount = totalCount + count;
//    }

    void  updateBrickCout(int count){
        synchronized (this) {
            totalCount = totalCount + count;
        }
    }

}
