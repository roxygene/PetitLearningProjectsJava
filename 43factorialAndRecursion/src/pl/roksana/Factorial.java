package pl.roksana;

public class Factorial {

    long factorial(int number)
    {
        long result = 1;
        if (number >= 1) //without this condition method will call itself endlessly
        {
            result = number * factorial(number - 1);
        }
        return result;
    }

    void display(int number)
    {
        System.out.println(number + "! = " + factorial(number));
    }

}
