/**
 * Created by akranz on 10/27/15.
 */
public class Driver {
    public static void main(String[] args) {
        Thread t = new A();
        Runnable r = new B();
        Thread f = new Thread(r);
        t.start();
        f.start();
    }
}
