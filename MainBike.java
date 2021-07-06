class Bike {
    Bike() {
        System.out.println("Bike Class");
    }

    void run1() {
        System.out.println("Running");
    }
}

class Splendor extends Bike {
    Splendor() {
        System.out.println("Splendor Class");
    }

    void run2() {
        System.out.println("Running at 60kmph");
    }
}

class MainBike {
    public static void main(String args[]) {
        Bike b = new Splendor();    // Upcasting: Base class variable `b`, in which we placed `Splendor` Derived class object.
        b.run1();
        // b.run2();    // run2() which is in the Derived class is not accessable by Base class object `b`.

        Bike b1 = new Bike();    // Normal Bike object made.
        b1.run1();
        // b1.run2();    // run2() not accessable by Parent class as its in Child class.

        Splendor s = new Splendor();    // Normal Splendor object made. NOTE that, here, PARENT CLASS CONSTRUCTOR executed before CHILD CLASS CONSTRUCTOR.
        s.run1();    // Child class object can also access Parent class methods and variables.
        s.run2();    // Child class object can obviously access its own methods.

        // Splendor s = new Bike();    // Derived class object `s` can't store Base class object.
    }
}