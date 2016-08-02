// **********************************************************
// Assignment3:
// UTORID user_name: sivara57
//
// Author: Shajan Sivarjah
//
//
// Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I received
// help from no one in designing and debugging my program.
// *********************************************************
package driver;

/**
 * 
 * @author Shajan Sivarjah
 *
 */
public class MyParser {

  /**
   * Main function to excute the program
   * @param args
   */
  public static void main(String[] args) {
    // create a variable to hold the output string
    String outputString = "";
    // create the output string for the desired urls
    outputString = outputType.PrintOutput.outputString(args);
    // if there are two arguments (One holding urls and the other holding
    // a outputfile name) out the string to a file 
    if (args.length >= 2) {
      // Call the method which outputs the stirng to a file
      outputType.FileOutput.outputToFile(outputString, args[1]);
    } else {
      // output the string to the console
      System.out.print(outputString);
    }
  }

}
