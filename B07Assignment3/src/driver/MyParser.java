//**********************************************************
//Assignment3:
//UTORID user_name:
//
//Author:
//
//
//Honor Code: I pledge that this program represents my own
//program code and that I have coded on my own. I received
//help from no one in designing and debugging my program.
//*********************************************************
package driver;


public class MyParser {

/**
* @param args
*/
public static void main(String[] args) {
  String outputString = "";
  outputString = outputType.PrintOutput.outputString(args);
  if (args.length >= 2){
    outputType.FileOutput.outputToFile(outputString, args[1]);
 }
  else{
    System.out.print(outputString);
  }
}

}