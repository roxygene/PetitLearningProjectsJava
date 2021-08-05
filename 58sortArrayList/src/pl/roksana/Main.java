package pl.roksana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    List list = new List();

    ArrayList listOfNumbers = list.addNumbersToCollection();

        System.out.println(listOfNumbers);
        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers);
        ArrayList newListOfNumbers = list.changeSecondElement(listOfNumbers);

        if (listOfNumbers.size() >= 2)
        {
            System.out.println("Here is new list, with changed second element:");
            System.out.println(newListOfNumbers);
            Collections.sort(newListOfNumbers);
            System.out.println(newListOfNumbers);
        }












    }
}
