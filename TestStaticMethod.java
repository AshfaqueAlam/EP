// Java Program to demonstrate the use of a Static Method.

class Student {
    int rollno;
    String name;
    static String college = "FIEM";
    // Static method to change the value of static variable
    static void change() {
        college = "ISU";
    }
    // Constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    // Method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

//Test class to create and display the values of object
public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change();    // Calling change method
        // Creating objects
        Student s1 = new Student(111, "Leila");
        Student s2 = new Student(222, "Kalinka");
        Student s3 = new Student(333, "Elsa");
        // Calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}