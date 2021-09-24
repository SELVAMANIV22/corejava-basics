package program.jav.filehandling;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {
  public static void main(String[] args) {

    char[] array = new char[100];
    try {
      // Creates a reader using the FileReader
      FileReader input = new FileReader("C://Users//Mridul Sharma//Desktop//Simplilearn//FSD_Phase_1//output.txt");

      // Reads characters
      input.read(array);
      
      System.out.println("Data in the file:");
      System.out.println(array);

      // Closes the reader
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}