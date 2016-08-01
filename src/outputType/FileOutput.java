package outputType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput{
  public static void outputToFile (String inputString, String fileName){
    try {
      File file = new File(fileName + ".txt");
      FileWriter fileWriter = new FileWriter(file);
      fileWriter.write(inputString);
      fileWriter.flush();
      fileWriter.close();
  } catch (IOException e) {
      System.out.print("Error - Failed to write to output file");;
  }
  }
}