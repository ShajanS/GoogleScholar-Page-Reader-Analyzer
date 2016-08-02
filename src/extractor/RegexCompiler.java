package extractor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Basic frame code given by Abbas Attarwala
 * Returns information stored at a given location within the url
 * using the html code
 * @author Shajan Sivarajah, Abbas Attarwala
 *
 */
public class RegexCompiler {
  /**
   * extractCodeInfo is a method that takes in parameters 
   * and returns the information stored at the regex html code given within the
   * code found at the provided google scholar url 
   * @param htmlRegex regex in html code
   * @param googleScholarURL
   * @return The information present at the given html regex
   */
  public static String extractCodeInfo(String htmlRegex, String googleScholarURL) {
    try {
      // retrieve the html code at the given url
      String rawHTMLString = ExtractHtml.getHTML(googleScholarURL);
      // set the specific regex html code to a variable
      String stringRegex = htmlRegex;
      // search throught the html url code to find the matching regex
      Pattern patternObject = Pattern.compile(stringRegex);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      // if found return the information stored at that location
      while (matcherObject.find()) {
        return matcherObject.group(1);
      }

    } catch (Exception e) {
      // return error message if error occurs 
      return "malformed URL or cannot open connection to given URL";
    }
    return null;
   }
  
}