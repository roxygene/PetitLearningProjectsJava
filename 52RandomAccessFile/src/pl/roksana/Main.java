//Program sets array of measurements into random access file and displays every second of them.
package pl.roksana;

public class Main {

    public static void main(String[] args)
    {
        MyRandomAccessFile file = new MyRandomAccessFile();
        file.writeToFile();
        file.readFile();
    }
}
