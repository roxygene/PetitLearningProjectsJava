package pl.roksana;


import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

public class TextFile {

    private String fileName;
    private String fileContent;

    private FileWriter fileWriter = null; //FileWriter is a class responsible for saving to text file
    //we use it later to check if data was saved to file properly
    private BufferedReader fileReader = null;

    static Scanner scanner = new Scanner(System.in);

    public String readTheData() //method asks for name and surname and returns string that contains given data
    {
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your surname: ");
        String surname = scanner.nextLine();

        return name + " " + surname;
    }

    public String saveToFile(String content)
    {
        System.out.print("Please, type the name of new file: ");
        fileName = scanner.nextLine();
        try
        {
            fileWriter = new FileWriter(fileName); //opening of the file with given name
            fileWriter.write(content); //writing given String to the file
            if (fileWriter != null) //checking if fileWriter got initialized
            {
                fileWriter.close(); //closing access to file
            }
        }
        catch (IOException exception)
        {
            System.out.println("Failed to open the file!");
        }


        return fileName;
    }

    public String readTheFile(String fileName) //function reads the file and returns its content
    {
        System.out.print("Please, type the name of the file you want to read: ");
        fileName = scanner.nextLine();
        try
        {
            fileReader = new BufferedReader(new FileReader(fileName));
            fileContent = fileReader.readLine();
            if (fileReader != null) //checking if fileReader got initialized
            {
                fileReader.close(); //closing access to file
            }
        }
        catch (IOException exception)
        {
            System.out.println("Failed to read the file!");
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
