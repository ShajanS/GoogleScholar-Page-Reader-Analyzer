package extractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extracts and returns the first three publications by the author
 * 
 * @author Shajan Sivarajah
 *
 */
public class ExtractPublicationTitle {
  /**
   * extractTitle retrieves the first three publications published by the author
   * 
   * @param googleScholarURL
   * @return String list of the first the publications
   */
  public static String[] extractTitle(String googleScholarURL) {
    // counter variable
    int titleCounter = 0;
    // create a storage to hold the first three title names
    String[] firstThreeTitles = new String[3];
    try {
      // fetch the information located at the given regex
      String rawHTMLString = ExtractHtml.getHTML(googleScholarURL);
      // specific regex used to find the title names
      String stringRegex = "<td id=\"col-title\"><a href=\".*?\" "
          + "class=\"cit-dark-large-link\">(.*?)</a>";
      Pattern patternObject = Pattern.compile(stringRegex);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      // loop through the titles found at the given regex
      // loop through until 3 titles have been saved
      while (matcherObject.find() && titleCounter < 3) {
        // save each title name to the storage list created
        firstThreeTitles[titleCounter] = matcherObject.group(1);
        // plus one to the counter
        titleCounter++;
      }
      // return the list of titles
      return firstThreeTitles;

    } catch (Exception e) {
      System.out.print("Error - Title(s) cannot be reached");
    }
    return null;

  }

}
