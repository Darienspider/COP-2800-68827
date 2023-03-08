import java.io.File;  
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        int minimum = 0;
        int maximum = 100;

        File outputFile = new File("/home/shadarien/java_course/COP-2800-68827/module12/textIOAssignment/src/output.txt");
        FileWriter writer = new FileWriter(outputFile);
        FileReader reader = new FileReader(outputFile);
        Scanner datafeed = new Scanner(reader);

        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) (Math.random() * (maximum - minimum + 1) + minimum); 
            writer.write(randomNumber + " ");
        }
        
        // Close the FileWriter object after writing all the data
        writer.close();

        // Read the data back from the file and display it in increasing order
        ArrayList characterStorage = new ArrayList<>();
        while (datafeed.hasNextInt()){
            int foundNumber = datafeed.nextInt();
            characterStorage.add(foundNumber);
        }
        reader.close();
        Collections.sort(characterStorage);
        System.out.println(characterStorage);
    }
}
