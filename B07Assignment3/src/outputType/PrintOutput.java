package outputType;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Outputs a formated string according to assignment REQ
 * 
 * @author Shajan Sivarjah
 *
 */
public class PrintOutput {

  /**
   * Outputs a string formated to requirements with all the wanted information
   * 
   * @param args parameters given (url files/names)
   * @return A formated string with all the wanted information
   */
  public static String outputString(String args[]) {
    String formatedString = "";
    // split argument one if more than one url is given
    String inputFiles[] = args[0].split(",");
    ArrayList<String> allCoAuthorNames = new ArrayList<String>();
    // for each url found in the argument
    for (String inputFile : inputFiles) {
      // set a variable to hold the 3 titles for each url
      String[] titles =
          extractor.ExtractPublicationTitle.extractTitle(inputFile);
      // call methods inorder to satisfy the REQ for the assignments and
      // format the string
      formatedString += "---------------------------------"
          + "--------------------------------------\n"
          + "1. Name of Author:\n\t"
          + extractor.ExtractAuthorNames.extractAuthorsName(inputFile) + "\n"
          + "2. Number of All Citations:\n\t"
          + extractor.ExtractCitations.extractAllCitationValue(inputFile) + "\n"
          + "3. Number of i10-index after 2009:\n\t"
          + extractor.Extracti10Index.extractIndexValue(inputFile) + "\n"
          + "4. Title of the first 3 publications:\n\t" + "1-   " + titles[0]
          + "\n" + "\t2-   " + titles[1] + "\n" + "\t3-   " + titles[2] + "\n"
          + "5. Total paper citation (first 5 papers):\n\t"
          + extractor.ExtractCitationsPerPublication.extractTotalCitations(
              inputFile)
          + "\n" + "6. Total Co-Authors:\n\t"
          + (extractor.ExtractCoAuthorNames.extractCoAuthorNames(inputFile))
              .size()
          + "\n";

      // append value to total coauthors after each url
      // remove all duplicates (merging two lists)
      allCoAuthorNames.removeAll(
          extractor.ExtractCoAuthorNames.extractCoAuthorNames(inputFile));
      // add new list values to the list
      allCoAuthorNames.addAll(
          extractor.ExtractCoAuthorNames.extractCoAuthorNames(inputFile));
      // sort the final list by aplha order
      Collections.sort(allCoAuthorNames);

      // after the last inputfile url output the co author's names list from all
      // urls found in the argument
      if (inputFile == inputFiles[inputFiles.length - 1]) {
        formatedString += "\n-------------------------------"
            + "----------------------------------------\n"
            + "7. Co-Author list sorted (Total: " + allCoAuthorNames.size()
            + "):\n";
        // go through the list of all the co authors name and add
        // each name found to the formated string
        for (String arg : allCoAuthorNames) {
          formatedString += arg + "\n";

        }

      }
    }
    // return the formatted string
    // removes the last unwanted newline break
    String formatedString1 = formatedString.trim();
    return formatedString1;

  }
}
