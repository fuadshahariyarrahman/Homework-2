package lt.vcd;

import java.util.Scanner;
import java.util.InputMismatchException;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for input
            System.out.print("Enter hours (0-23): ");
            int h = scanner.nextInt();

            System.out.print("Enter minutes (0-59): ");
            int m = scanner.nextInt();

            System.out.print("Enter seconds (0-59): ");
            int s = scanner.nextInt();

            // Validate initial time inputs
            if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
                System.out.println("Invalid time input! Please ensure h is 0-23, m is 0-59, and s is 0-59.");
                return;
            }

            // Increment seconds by 1
            s++;

            // Handle rollover
            if (s == 60) {
                s = 0;
                m++;
                if (m == 60) {
                    m = 0;
                    h++;
                    if (h == 24) {
                        h = 0;
                    }
                }
            }

            // Output the formatted result
            System.out.printf("Time one second later: %02d:%02d:%02d%n", h, m, s);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integer values only.");
        } finally {
            scanner.close();
        }
    }
}