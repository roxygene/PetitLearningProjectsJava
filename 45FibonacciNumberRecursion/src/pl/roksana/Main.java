package pl.roksana;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciNumbers fNumber = new FibonacciNumbers();

        boolean error;
        int amount;
        int[]  fibonacciNumbers; //array stores generated Fibonacci numbers

        System.out.println("How many Fibonacci numbers do you want to calculate?");

        do
        {
            error = false;

            try
            {
                amount = sc.nextInt();
                fibonacciNumbers = new int[amount];
                fNumber.displayFibonacciNumbers(fibonacciNumbers, amount);
            }
            catch (InputMismatchException exception)
            {
                error = true;
                System.out.println("This is not a number. Try again!");
                sc.next();
            }
            catch (NegativeArraySizeException exception)
            {
                error = true;
                System.out.println("The amount can't be negative. Try again!");

            }

        }while (error);


    }
}
