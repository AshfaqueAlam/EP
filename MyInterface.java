// Program to demonstrate working of `interface`.

interface FIEM {
    void clgid();
}

interface University {
    void uid();
}

public class MyInterface implements FIEM, University {
    @Override    // After seeing this java compiler understands that the function below is an abstract method and its body is written in this class.
    public void uid() {
        System.out.println("Uname: MAKAUT");
    }

    @Override
    public void clgid() {
        System.out.println("Clg code: 148");
    }

    public static void main(String[] args) {
        MyInterface i = new MyInterface();
        i.clgid();
        i.uid();
    }
}
