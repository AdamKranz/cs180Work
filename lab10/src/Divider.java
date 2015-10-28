import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by akranz on 10/27/15.
 */
public class Divider implements Runnable{
    public AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void run() {
        try {
            thread thread1 = new thread(1, 1000);
            thread thread2 = new thread(1001, 2000);
            thread thread3 = new thread(2001, 3000);
            thread1.run();
            thread1.join();
            thread2.run();
            thread2.join();
            thread3.run();
            thread3.join();
        } catch (InterruptedException e) {System.out.println("Big problem");}
    }

    public class thread extends Thread {
        private int start;
        private int end;
        public thread(int start, int end) {
            this.start = start;
            this.end = end;
        }
        public void run() {
            for (int i = start; i <= end; i++)
                if (i%7==0)
                    counter.getAndIncrement();
        }
    }

    public static void main(String[] args) {
        Divider d = new Divider();
        d.run();
        System.out.println(d.counter);
    }
}
