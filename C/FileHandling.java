import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite
  {
      public static void main(String[] args) 
      { 
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

           
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

           
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a newline character for each line
            }

   
            reader.close();
            writer.close();

            System.out.println("File read and write successful.");

        }
        catch (IOException e) 
        {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
      }
  }
