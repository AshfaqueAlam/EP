// Low priority thread - Mostly used for garbage collection.

package java_threads;
public class DaemonThread extends Thread {

    public DaemonThread() {
        setDaemon(true);
    }
    public void run() {
        System.out.println("Is this thread Daemon? - " + isDaemon());
    }
    public static void main(String a[]) {    // main() runs in background.
        DaemonThread dt = new DaemonThread();
        // even you can set daemon constrain here also
        // it is like dt.setDeamon(true)
        dt.start();
    }
}