public class Thread_by_extending extends Thread {
    protected int count, inc, delay;

    public Thread_by_extending(int init, int inc, int delay) {
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
        new Thread_by_extending(0, 1, 33).start();
        new Thread_by_extending(0, -1, 100).start();
    }
}
