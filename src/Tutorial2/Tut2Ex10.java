// Design class Person

package Tutorial2;

public class Tut2Ex10 {
    public class Person {
        String name, address, phoneNo, email;
    }

    public class Student extends Person {

    }

    public class Employee extends Person {
        String office, dateHired;
        int salary;
    }

    public class Faculty extends Employee {
        float officeHours;
        String rank;
    }

    public class Staff extends Employee {
        String title;
    }

    public class MyDate {
        int year, month, day;
    }
}
