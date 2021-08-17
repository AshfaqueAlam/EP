public class ThreadByImplementing implements Runnable {
    protected int count, inc, delay;

    public ThreadByImplementing(int init, int c, int delay) {
        this.count = int; this.inc = inc; this.delay = delay;
    }

    public void run() {
        try {
            for (;;) {
                System.out.print(count + " ");
                count += inc;
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        new Thread(new ThreadByImplementing(0, 1, 33)).start();
        new Thread(new ThreadByImplementing(0, -1, 100)).start();
    }
}