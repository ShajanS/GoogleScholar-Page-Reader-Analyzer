package extractor;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCoAuthors {
  
  public static String extractCoAuthorNames(String googleScholarURL) {
    try {
      
      int coAuthorCount = 0;
      ArrayList<String> coAuthorList = new ArrayList<String>();
      
      String rawHTMLString = ExtractHtml.getHTML(googleScholarURL);
      String stringRegex =  "<a class=\"cit-dark-link\" "
          + "href=\".*?hl=en\" title=\".*?\">(.*?)</a>";
      Pattern patternObject = Pattern.compile(stringRegex);
      Matcher matcherObject = patternObject.matcher(rawHTMLString);
      
      while (matcherObject.find()) {
        coAuthorList.add(matcherObject.group(1));
        coAuthorCount += 1;
        
      }
      
      return Integer.toString(coAuthorCount);

    } catch (Exception e) {
      System.out.println("malformed URL or cannot open connection to "
          + "given URL");
    }
    return null;
   }
  
}