package pl.roksana;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    int size;

    int[] createArray()
    {
        Scanner scanner = new Scanner(System.in);
        boolean error; //variable controls loop do...while
        System.out.print("How many numbers to generate? ");

        int[] numbers; //I have to declare array here for function to be able to return it later

        do {
            error = false;

            try
            {
                size = scanner.nextInt(); //loads size from user
                numbers = new int[size]; //initialisation of array

                System.out.print("Unsorted numbers: ");
                for (int i = 0; i < size; i++) //loop assigns value to every element of array and displays it
                {
                    numbers[i] = getRandomNumber(0, 1000);
                    System.out.printf("%6d", numbers[i]);
                }

                return numbers;
            }
            catch (InputMismatchException exception)
            {
                System.out.println("It is not a number! Try again.");
                error = true;
                scanner.next(); //cleaning the buffer
                //continue; - it actually turned out to be redundant
            }
            catch (NegativeArraySizeException exception)
            {
                System.out.println("Number of figures has to be positive number! Try again.");
                error = true;
            }

            }while(error);

        return new int[1];//returns created array or empty array with one element if something would go wrong
    }

    int getRandomNumber(int min, int max) //returns pseudo random number from set range
    {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
