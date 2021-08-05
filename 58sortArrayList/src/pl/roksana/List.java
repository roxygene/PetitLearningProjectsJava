package pl.roksana;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class List
{
    static Scanner scanner = new Scanner(System.in);
    public ArrayList addNumbersToCollection()
    {
        boolean addAnotherNumber = true;
        ArrayList listOfNumbers = new ArrayList();



        while(addAnotherNumber)
        {
            System.out.println("Please enter the number or press x to stop adding numbers.");
            String tmp = scanner.nextLine();


            if(tmp.equals("x"))
            {
                addAnotherNumber = false;
            }
            else
            {
                try
                {
                    listOfNumbers.add(Float.parseFloat(tmp));
                }
                catch (NumberFormatException exception)
                {
                    System.out.println("This is neither number or x, try again.");
                }
            }
        }

        return listOfNumbers;
    }

    public ArrayList changeSecondElement(ArrayList list)
    {
        if(list.size() >= 2)
        {
            list.remove(1);
            System.out.println("Second number has been removed.");
            System.out.println(list);
            System.out.println("Please enter new second element.");

            try
            {
                list.add(1, scanner.nextFloat());
            }
            catch (InputMismatchException exception)
            {
                scanner.next();
                System.out.println("It has to be the number. Try again!");
                list.add(1, scanner.nextFloat());
            }


        }
        else
        {
            System.out.println("This list is to short to change second element.");
        }
        return list;
    }
}
