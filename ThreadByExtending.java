public class ThreadByExtending extends Thread {
    protected int count, inc, delay;

    public ThreadByExtending(int init, int inc, int delay) {
        this.count = int; this.inc = inc; this.delay = delay;
    }
 
    public void run() {
        try {
            for (;;) {
                System.out.print(count + " ");
                count += inc;
                sleep(delay);
            }
        } catch (InterruptedException e) {}
    }
 
    public static void main(String[] args) {
        new ThreadByExtending(0, 1, 33).start();
        new ThreadByExtending(0, -1, 100).start();
    }
}
