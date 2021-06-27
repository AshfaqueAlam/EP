class Test {
    // static int i;
    int j;
    String s;
    {
        System.out.println("As we forgot to write static in this block. It will execute before every constructor.");
    }
    static {
        System.out.println("Hiiii");
    }
    Test() {
        System.out.println("Constructor called");
    }
    Test (int a) {
        j = a;
        System.out.println("The vlaue of j is " + j);
    }
    Test (String s1) {
        s = s1;
        System.out.println("The value of s= " + s);
    }
}

class StaticBlock {
    public static void main(String args[]) {
        // Although we have two objects, static is executed only once.
        Test t1 = new Test();
        Test t2 = new Test(100);
        Test t3 = new Test("MCA");
    }
}