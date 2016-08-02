package extractor;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Returns the
 * 
 * @author Shajan Sivarajah
 *
 */
public class ExtractCoAuthorNames {

  public static ArrayList<String> extractCoAuthorNames(
      String googleScholarURL) {
    try {

      ArrayList<String> coAuthorList = new ArrayList<String>();

      String rawHTMLString = ExtractHtml.extractHTML(googleScholarURL);
      String stringRegex = "<a class=\"cit-dark-link\" "
          + "href=\".*?hl=en\" title=\".*?\">(.*?)</a>";
      Pattern patternObject = Pattern.compile(stringRegex);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);

      while (matcherObject.find()) {
        coAuthorList.add(matcherObject.group(1));

      }

      return coAuthorList;

    } catch (Exception e) {
      System.out.println("Error- CoAuthor's Name(s) cannot be obtained");
    }
    return null;
  }

}
