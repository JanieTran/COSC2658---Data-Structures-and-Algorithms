package Tutorial2;

import java.util.Scanner;

public class Tut2Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PAYROLL STATEMENT GENERATOR");

        System.out.print("Employee's name: ");
        String name = input.nextLine();
        System.out.print("Hours/week: ");
        float hours = input.nextFloat();
        System.out.print("Hourly pay rate: ");
        float payRate = input.nextFloat();
        System.out.print("Federal tax: ");
        float federal = input.nextFloat();
        System.out.print("State tax: ");
        float state = input.nextFloat();

        float preTax = (payRate * hours);
        float tax = preTax * ((federal + state)/100);
        float payment = preTax - tax;

        System.out.println();
        System.out.println("=============");
        System.out.println();

        System.out.println("Employee's name: " + name);
        System.out.println("Pre-tax total: " + preTax);
        System.out.println("Total tax: " + tax);
        System.out.println("Total: " + payment);
    }
}
