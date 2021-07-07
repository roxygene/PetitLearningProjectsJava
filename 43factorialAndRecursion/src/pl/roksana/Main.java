//Program calculates fractional of input number.
package pl.roksana;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean error; //variable controls the loop
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            error = false;
            System.out.print("Please enter the number: ");
            try
            {
                number = scanner.nextInt();
            }
            catch (InputMismatchException exception)
            {
                System.out.println("\nThis is not a number! Try again.");
                scanner.next();
                error = true;
                continue;
            }

            if (number < 0)
            {
                error = true;
                System.out.println("\nThe number must be positive or equal to 0! Try again.");
            }
        }while (error);

        Factorial f = new Factorial();

        f.display(number);

    }
}
