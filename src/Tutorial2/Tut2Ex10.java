package Tutorial2;

public class Tut2Ex10 {
    public class Person {
        String name, address, phoneNo, email;
    }

    public class Student extends Person {
        String classStatus;
    }

    public class Employee extends Person {
        String office, dateHired;
        int salary;
    }

    public class Faculty extends Employee {

    }

    public class Staff extends Employee {

    }
}
