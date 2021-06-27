// Java Program to demonstrate the use of an Instance Variable.
// Which get memory each time when we create an object of the class.

class TestInstanceVariable {
    // int counter=0;    // Will get memory each time when the instance is created.
    static int count = 0;
    TestInstanceVariable() {
        count++;    // Incrementing value
        System.out.println(count);
    }
    public static void main(String args[]) {
        // Creating objects
        TestInstanceVariable c1 = new TestInstanceVariable();
        TestInstanceVariable c2 = new TestInstanceVariable();
        TestInstanceVariable c3 = new TestInstanceVariable();
    }
}