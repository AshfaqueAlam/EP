// Third brackets [] not synchronized example.

package java_threads;
class First {
    public void display(String msg) {
        System.out.print ("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println ("]");
    }
}

class Second extends Thread {
    String msg;
    First fobj;
    Second (First fp, String str) {
        fobj = fp;
        msg = str;
        start();
    }
    public void run() {
        fobj.display(msg);
    }
}

public class NoSyncronization {
    public static void main (String[] args) {
        First fnew = new First();
        Second ss = new Second(fnew, "welcome");
        Second ss1 = new Second(fnew, "new");
        Second ss2 = new Second(fnew, "programmer");
    }
}


/*
*[welcome[new[programmer
]
]
*/