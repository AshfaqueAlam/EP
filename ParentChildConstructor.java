class Parent{
    Parent(){
        System.out.println("In the base class Parent.");
    }
}

public class ParentChildConstructor extends Parent{    // Derived Main class.
    ParentChildConstructor(){
        System.out.println("In the derived class ParentChildConstructor.");
    }

    public static void main(String args[]){
        ParentChildConstructor c=new ParentChildConstructor();
    }
}