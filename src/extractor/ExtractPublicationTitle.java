package extractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPublicationTitle {

  public static String[] extractTitle(String googleScholarURL) {
    int titleCounter = 0;
    String[] firstThreeTitles = new String[3];
    try {
      String rawHTMLString = ExtractHtml.getHTML(googleScholarURL);
      String stringRegex = "<td id=\"col-title\"><a href=\".*?\" "
          + "class=\"cit-dark-large-link\">(.*?)</a>";
      Pattern patternObject = Pattern.compile(stringRegex);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      
      while (matcherObject.find() && titleCounter < 3) {
        firstThreeTitles[titleCounter] = matcherObject.group(1);
        titleCounter ++;
      }
      return firstThreeTitles;

    } catch (Exception e) {
      System.out.print("malformed URL or cannot open connection to given URL");
    }
    return null;

  }

}
