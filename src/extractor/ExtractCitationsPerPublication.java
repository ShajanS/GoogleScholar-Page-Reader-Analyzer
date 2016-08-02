package extractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extract the sum of the number of citations used for the first 5 publications
 * 
 * @author Shajan Sivarajah
 *
 */
public class ExtractCitationsPerPublication {
  /**
   * extractTotalCitations is a method which returns the total number of
   * citations used for the first 5 publications
   * 
   * @param googleScholarURL
   * @return Number of citations (for 5 Publications)
   */
  public static String extractTotalCitations(String googleScholarURL) {
    // Variables to keep count of total citations and number of publications
    int totalCitations = 0;
    int publicationCounter = 0;
    try {
      // fetch the information located at the given regex
      String rawHTMLString = ExtractHtml.extractHTML(googleScholarURL);
      // specific regex used to find the citation values
      String stringRegex = "<td id=\"col-citedby\">"
          + "<a class=\"cit-dark-link\" href=\".*?\">(.*?)</a></td>";
      Pattern patternObject = Pattern.compile(stringRegex);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      // loop through and retrieve the values of
      // the first five citations encountered
      while (matcherObject.find() && publicationCounter < 5) {
        // add values of the citations to total variable
        totalCitations += Integer.parseInt(matcherObject.group(1));
        // plus one when finished with one publication (only 5 needed)
        publicationCounter++;
      }
      // change integer to string and return the value
      return Integer.toString(totalCitations);

    } catch (Exception e) {
      // return error is exception is caught
      System.out.print("Error - Citation value(s) cannot be obtained");
    }
    return null;

  }

}

