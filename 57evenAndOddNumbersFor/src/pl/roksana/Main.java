package pl.roksana;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array array = new Array();

        int sizeOfArray = 0;
        System.out.print("Please enter the size of an array: ");

        try
        {
            sizeOfArray = scanner.nextInt();
            if(sizeOfArray < 0)
            {
                throw new NegativeArraySizeException();
            }
        }
        catch (NegativeArraySizeException exception)
        {
            scanner.next();
            System.out.println("\nSize of an array has to be positive number. Please try again! ");
            sizeOfArray = scanner.nextInt();
        }
        catch (InputMismatchException exception)
        {
            scanner.next();
            System.out.println("\nSize of an array has to be positive number. Please try again! ");
            sizeOfArray = scanner.nextInt();
        }

        int[] newArray = array.createArray(sizeOfArray);
        System.out.println("Sum of even numbers: " + array.addEvenElements(newArray));
        System.out.println("Sum of odd numbers: " + array.addOddElements(newArray));

    }
}
