//Program saves typed name and surname to file and then reads it.
package pl.roksana;

public class Main {

    public static void main(String[] args)
    {
        TextFile tf = new TextFile();
        String savedFile = tf.saveToFile(tf.readTheData());

        tf.setFileName(savedFile); //setting new fileName

        System.out.println("File contains:" + tf.readTheFile(tf.getFileName()));
    }
}
