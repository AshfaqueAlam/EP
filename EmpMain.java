public class EmpMain {    // Main Class
    public static void main(String args[]) {

        Manager m = new Manager("ASI", 2304, 32528);    // When working with inheritance. First Base class constructor executes after that Derived class constructor executes.
        m.displayMgr();
        m.show();

        // Account a = new Account(2132, 23700);
        // a.displayAcc();
        // a.show();

        // Employee e = new Employee();
        // e.show();
        //e.displayMgr();    // Derived class can access methods/functions and variables of Parent class but its vice versa is not true.
    }
}


class Employee {    // Base Class

    String org;

    Employee() {
        System.out.println("In the Employee class");
    }

    void show() {
        System.out.println("Employee of the " + org);
    }
}


class Manager extends Employee {    // Derived Class

    int mgrid, salary;

    Manager(String x, int a, int b) {
        org = x;
        mgrid = a;
        salary = b;
    }

    void displayMgr() {
        System.out.println("Mgr Id: " + mgrid + ", Salary: " + salary + ", Organization: " + org);
    }
}


class Account extends Employee {    // Derived Class

    int accid, sal;

    Account(int p, int q) {
        accid = p;
        sal = q;
        System.out.println("In the Account class...");
    }

    void displayAcc() {
        System.out.println(accid + "\t,\t" + sal + "\t,\t" + org);
    }
}