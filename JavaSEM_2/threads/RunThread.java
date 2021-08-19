class MySmpThread extends Thread {
    public static int myCount = 0;

    public void run() {
        while (MySmpThread.myCount <= 10) {
            try {
                System.out.println("Exp1 Thread: " + (++MySmpThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: " + iex.getMessage());
            }
        }
    }
}

public class RunThread {
    public static void main(String[] args) {
        System.out.println("Starting Main Thread...");
        MySmpThread mst = new MySmpThread();
        mst.start();
        while (MySmpThread.myCount <= 10) {
            try {
                System.out.println("Main Thread: " + (++MySmpThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in main thread: " + iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}



/* OUTPUT :-
*  ------
* Starting Main Thread...
* Exp1 Thread: 2
* Main Thread: 1
* Exp1 Thread: 3
* Main Thread: 4
* Exp1 Thread: 5
* Main Thread: 6
* Exp1 Thread: 7
* Main Thread: 8
* Exp1 Thread: 9
* Main Thread: 10
* Exp1 Thread: 11
* End of Main Thread...
*/