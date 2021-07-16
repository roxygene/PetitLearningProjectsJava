package pl.roksana;


import java.io.*;
import java.util.Scanner;

public class TextFile
{
    private String fileName;
    private String fileContent;
    static Scanner scanner = new Scanner(System.in);

    public String writeToFile(String content)
    {
        System.out.print("Please enter the name of the file you want to write to: ");
        fileName = scanner.nextLine();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)); //constructor with path to file or name of file
            bw.write(content);
            bw.close();
        }
        catch (IOException e)
        {
            System.out.println("Writing to file failed!");
        }

        return fileName;
    }

    public String readFromFile()
    {
        fileContent = "";
        System.out.print("Please enter name of the file you want to read: ");
        fileName = scanner.nextLine();

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ( (line = br.readLine()) != null)
            {
                System.out.println(line);
                fileContent += line;
            }
            br.close();
        }
        catch (IOException e)
        {
            System.out.println("\nFailed to read the file!");
        }
        return fileContent;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
