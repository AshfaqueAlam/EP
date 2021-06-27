public class OrderOfStaticBlock {
    static {
        System.out.println("Static 1 block called");
    }
    static {
        System.out.println("Static 4 block called");
    }
    static {
        System.out.println("Static 2 block called");
    }
    public static void main(String args[]) {
        // Altough we have two objects, static block is executed only once
        System.out.println("main method is called");
    }
    static {
        System.out.println("static 3 block called");
    }
}