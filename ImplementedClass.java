// Program to demonstrate working of `interface`.

// A simple interface
interface InterF {
    // Public, static and final
    final int var = 104;

    // Public and abstract
    void show();
}

// A class that implements the interface.
class ImplementedClass implements InterF {

    // Implementing the capabilities of interface.
    public void show() {
        System.out.println("An example of how interface works in Java.");
    }

    // Driver code
    public static void main (String[] args) {
        ImplementedClass ic = new ImplementedClass();
        ic.show();
        System.out.println("Public Variable: " + var);
    }
}
