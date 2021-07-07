package pl.roksana;

public class FibonacciNumbers
{
    int generateFibonacciNumber(int amount)
    {
        if (amount == 1)
        {
            return 0;
        }
        else if (amount == 2)
        {
            return 1;
        }
        else
        {
            return generateFibonacciNumber(amount - 1) + generateFibonacciNumber(amount - 2);
        }

    }

    void displayFibonacciNumbers(int[]  fibonacciNumbers, int amount)
    {

        for (int i = 0; i < amount; i++)
        {
            fibonacciNumbers[i] = generateFibonacciNumber(i + 1);
            System.out.println(fibonacciNumbers[i] + ", ");
        }
    }


}
