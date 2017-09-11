package homeworkcalculatoroop;

import static homeworkcalculatoroop.Button.compute;

/**
 * My first Java program. Calculator VERSION 0.0.0.0.0.2
 *
 * @author Claudiu Laita
 */
public class Screen {

    public static double display = 0;

    //Start up message
    public static void display() {
        System.out.println("\n" + "This is a calculator. "
                + "Use 'clear' command to retry the operation" + "\n" + display);
    }

    public static void askFirst() {
        System.out.println("\n" + "Please introduce your first number:");
    }

    public static void askSecond() {
        System.out.println("Please introduce your second number:");
    }

    public static void askOperator() {
        System.out.println("Please introduce operator(+/-/*//)");
    }

    public static void askEquals() {
        System.out.println("Please introduce = to show result");
    }

    //Should restart the calculator
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        compute();
    }

    public static void displayErr1() {
        System.out.println("Error, you introduced wrong data. I quit.");
        System.exit(0);
    }
}
