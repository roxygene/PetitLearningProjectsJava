package pl.roksana;

public class BubbleSort {

    int[] sort(int[] messyNumbers)
    {
        for(int i = 0; i < messyNumbers.length; i++ )
        {
            for(int j = 1; j < messyNumbers.length; j++)
            {
                if (messyNumbers[j] < messyNumbers[j - 1])
                {
                    int temporary;
                    temporary = messyNumbers[j];
                    messyNumbers[j] = messyNumbers[j - 1];
                    messyNumbers[j - 1] = temporary;
                }
            }
        }

        int[] sortedNumbers;
        sortedNumbers = messyNumbers;
        return sortedNumbers;
    }

    void displaySortedNumbers(int[] sortedArray)
    {
        System.out.print("\nSorted numbers: ");
        for(int i = 0; i < sortedArray.length; i++)
        {
            System.out.printf("%6d", sortedArray[i]);
        }
    }
}
