// Java Program to demonstrate the use of Static Variable.

class Student {
    int rollno;    // Instance variable
    String name;
    static String college = "FIEM";    // Static Variable
    // Constructor
    Student (int r, String n) {
        rollno = r;
        name = n;
    }
    // Method to display the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
// Test class to show the values of objects
public class TestStaticVariable {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Lara");
        Student s2 = new Student(222, "Tifa");
        // We can change the college of all the objects by the single line of code.
        // Student.college="ISU";
        s1.display();
        s2.display();
        Student.college = "ISU";
        s1.display();
        s2.display();
    }
}