package program.jav.filehandling;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {
  public static void main(String args[]) {

    String data = "This is the data in the output file";
    
    try {
      // Creates a Writer using FileWriter
      FileWriter output = new FileWriter("C://Users//Mridul Sharma//Desktop//Simplilearn//FSD_Phase_1//output.txt");

      //File k = new File("C://Users//Mridul Sharma//Desktop//Simplilearn//FSD_Phase_1//file.txt");
      
      // Writes string to the file
      output.write(data);
      System.out.println("Data is written to the file.");

      // Closes the writer
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
 }
}