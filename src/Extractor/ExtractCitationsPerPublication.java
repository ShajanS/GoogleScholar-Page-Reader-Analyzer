package Extractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCitationsPerPublication {

  public static String extractTotalCitations(String googleScholarURL) {
    int totalCitations = 0;
    int publicationCounter = 0;
    try {
      String rawHTMLString = ExtractHtml.getHTML(googleScholarURL);
      String stringRegex = "<td id=\"col-citedby\">"
          + "<a class=\"cit-dark-link\" href=\".*?\">(.*?)</a></td>";
      Pattern patternObject = Pattern.compile(stringRegex);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      
      while (matcherObject.find() && publicationCounter < 5) {
        totalCitations += Integer.parseInt(matcherObject.group(1));
        publicationCounter ++;
      }
      return Integer.toString(totalCitations);

    } catch (Exception e) {
      return "malformed URL or cannot open connection to given URL";
    }

  }

}

