package pl.roksana;

public class Array {
    private int size;

    public int[] createArray(int size)
    {
        int[] array = new int[size];

        for(int i = 0; i < size; i++)
        {
            array[i] = i;
        }
        return array;
    }

    public int addEvenElements(int[] array)
    {
        int sumOfEvenNumbers = 0;
        for (int element : array)
        {
            if(element % 2 == 0)
            {
                sumOfEvenNumbers += element;
            }
        }

        return sumOfEvenNumbers;
    }

    public int addOddElements(int[] array)
    {
        int sumOfOddNumbers = 0;
        for (int element : array)
        {
            if (element % 2 == 1)
            {
                sumOfOddNumbers += element;
            }
        }
        return sumOfOddNumbers;
    }

}
