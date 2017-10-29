// Write a program to convert weight values between kilogram and pound.
// The program should ask user to choose conversion mode
// and the input value from keyboard with appropriate guiding text.

package Tutorial2;

import java.util.Scanner;

public class Tut2Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("WEIGHT CONVERTER");
        System.out.print("Choose conversion mode, 1 for kg-lbs and 2 for lbs-kg: ");
        int mode = input.nextInt();
        System.out.print("Enter weight: ");
        float weight = input.nextFloat();

        float result;
        if (mode == 1) {
            result = weight * 2.2f;
            System.out.printf("%.2f kg equals to %.2f lbs", weight, result);
        } else {
            result = weight / 2.2f;
            System.out.printf("%.2f lbs equals to %.2f kg", weight, result);
        }
    }
}
