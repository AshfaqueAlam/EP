abstract class P1 {
    abstract void x();
}

abstract class C1 extends P1 {
    void y() {
        System.out.println("In Child 1");
    }
}

class C2 extends C1 {
    void x() {
        System.out.println("In Child 2");
    }
}

public class Abstract_Exmpl {
    public static void main(String[] args) {
        C2 b = new C2();
        b.x();
        b.y();

        // If we do this it will not work:-
        // P1 p = new P1();    // Here you can't make object of abstract class.
        // C1 c = new C1();    // Since abstract method/function not declared in this class so we cannot make object of this either.
    }
}
