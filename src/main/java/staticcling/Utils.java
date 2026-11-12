package staticcling;

import java.util.Scanner;

public class Utils {

    private static Scanner myScanner = new Scanner(System.in);

    /**
     * Prompts the user for a floating-point number and validates numeric input before returning it
     * @param message Prompt for the numeric input
     * @return the number the user enters as a double
     */
    public static double promptForDouble(String message) {

        boolean done = false;
        double result = 0;

        do {
            System.out.println(message);
            String input = myScanner.nextLine();
            input = input.trim();

            try {
                result = Double.parseDouble(input);
                done = true;
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid number format, try again.");
            }
        } while(!done);

        return result;
    }

    private Utils() {}

}
