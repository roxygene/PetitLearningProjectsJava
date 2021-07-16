package pl.roksana;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Array array = new Array();
        TextFile tf = new TextFile();

        System.out.print("Please enter the size of an array: ");
        int size;
        int specialRow;

        try
        {
            size = scanner.nextInt();
            scanner.nextLine();
            if (size < 1)
            {
                throw new NegativeArraySizeException("Size of an array has to be greater than 0!");
            }
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("\nSize of an array has to be greater than 0. Try again!");
            size = scanner.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("\nSize of an array has to be the number. Try again!");
            size = scanner.nextInt();
        }
        array.setSize(size);

        System.out.print("\nPlease enter the number of special row: ");
        try
        {
            specialRow = scanner.nextInt();
            if(size < 0)
            {
                throw new InputMismatchException("Number of row has to be equal or greater than 0.");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("\nNumber of special row has to be number equal or graeter than 0. Try again!");
            specialRow = scanner.nextInt();;
        }
        array.setSpecialRow(specialRow);

        int[][] firstArray = array.createArray(array.getSize(), array.getSpecialRow());
        int[][] transposedArray = array.remodifyArray(firstArray);
        String arrayTurnedIntoText = array.arrayToText(transposedArray);

        tf.writeToFile(arrayTurnedIntoText);
        tf.readFromFile();






    }
}
