package outputType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Outputs the given text to a text file
 * @author Shajan Sivarajah
 *
 */
public class FileOutput{
  /**
   * outputToFile outputs the given string(text) to a text file
   * @param inputString text that needs to get sent to file
   * @param fileName output file name
   */
  public static void outputToFile (String inputString, String fileName){
    try {
      // create a new file with the given name
      File file = new File(fileName + ".txt");
      // setup a writer to input information into the file
      FileWriter fileWriter = new FileWriter(file);
      // add the given text string to the file
      fileWriter.write(inputString);
      fileWriter.flush();
      // wrap it up and close the file
      fileWriter.close();
  } catch (IOException e) {
    // output and error message 
    System.out.print("Error - Failed to write to output file");;
  }
  }
}