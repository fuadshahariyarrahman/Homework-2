package lt.vcd;

import java.util.Scanner;
import java.util.InputMismatchException;

public class task1 { // <-- Class name matches task1.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        try {
            int year = scanner.nextInt();

            if (year >= 1896 && (year - 1896) % 4 == 0) {
                int edition = ((year - 1896) / 4) + 1;
                System.out.println(year + " is an Olympic year. Edition Number: " + edition);
            } else {
                System.out.println(year + " is not an Olympic year.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for the year.");
        } finally {
            scanner.close();
        }
    }
}