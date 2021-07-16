package pl.roksana;

public class Array
{
    private int size;
    private int specialRow;

    public int[][] createArray(int size, int specialRow) //method creates array with given parameters
    {
        int[][] newArray = new int[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (i == specialRow)
                {
                    newArray[i][j] = 1;
                }
                else
                {
                    newArray[i][j] = 0;
                }
                System.out.print(newArray[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\n");
        return newArray;
    }

    public int[][] remodifyArray( int[][] primaryArray) //method transposes given array
    {
        size = primaryArray.length;
        int[][] newArray = new int[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                newArray[i][j] = primaryArray[j][i];
                System.out.print(newArray[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\n");
        return newArray;
    }

    public String arrayToText(int[][] array)
    {
        String text = "";
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                text += array[i][j];
                text += "  ";
            }
            text += "\n";
        }
        return text;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public int getSpecialRow() {
        return specialRow;
    }

    public void setSpecialRow(int specialRow) {
        this.specialRow = specialRow;
    }
}
