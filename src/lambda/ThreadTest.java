package lambda;

public class ThreadTest {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running.");
            }
        };
        Thread t1 = new Thread(r);
        t1.start();

        Runnable r1 = () -> {
            System.out.println("Thread2 is running.");
        };
        Thread t2 = new Thread(r1);
        t2.start();

        Thread t3 = new Thread(()-> {
            System.out.println("next thread is running.");
        });
        t3.start();


    }
}
