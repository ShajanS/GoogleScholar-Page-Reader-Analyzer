package Extractor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import driver.MyParser;

public class AuthorNameExtractor {
  
  public static void extractAuthorsName(String googleScholarURL) {
    try {
      MyParser googleScholarParser = new MyParser();
      String rawHTMLString = googleScholarParser.getHTML(googleScholarURL);

      String reForAuthorExtraction =
          "<span id=\"cit-name-display\" "
              + "class=\"cit-in-place-nohover\">(.*?)</span>";
      Pattern patternObject = Pattern.compile(reForAuthorExtraction);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      while (matcherObject.find()) {
        System.out.println("DEBUG: Authors Name is " + matcherObject.group(1));
      }

    } catch (Exception e) {
      System.out.println("malformed URL or cannot open connection to "
          + "given URL");
    }
   }
  
}