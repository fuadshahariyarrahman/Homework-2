package lt.vcd;

import java.util.Scanner;
import java.util.InputMismatchException;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        try {
            int year = scanner.nextInt();

            boolean isLeapYear = false;

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                if (year % 4 == 0) {
                    isLeapYear = true;
                }
            }

            // Output the result
            if (isLeapYear) {
                System.out.println(year + " is a leap year (366 days).");
            } else {
                System.out.println(year + " is a non-leap year (365 days).");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for the year.");
        } finally {
            scanner.close();
        }
    }
}