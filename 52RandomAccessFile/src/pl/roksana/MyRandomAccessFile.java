package pl.roksana;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyRandomAccessFile
{
    private double[] array = {10.1, 3.5, 89.7, 60.28, 100.12, 0.01};

    public void writeToFile()
    {
        try
        {
            RandomAccessFile raf = new RandomAccessFile("measurements.dat", "rw");//opens random access file in write/read mode
            for (int i = 0; i < array.length; i++)
            {
                raf.writeDouble(array[i]); //writing every element of array to file
            }
            raf.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
        catch (IOException e)
        {
            System.out.println("Writing to file failed!");
        }
    }

    public void readFile()
    {
        String reading;
        try
        {
            RandomAccessFile raf = new RandomAccessFile("measurements.dat", "r");//opens random access file in read mode
            for (int i = 0; i < array.length; i+=2) //every second element of array
            {
                raf.seek(8 * i); // double has 8 baits
                reading = Double.toString(raf.readDouble());
                System.out.println(reading);
            }
            raf.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
        catch (IOException e)
        {
            System.out.println("Writing to file failed!");
        }
    }
}
