package Extractor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCompiler {
  
  public static void extractCodeInfo(String htmlRegex, String googleScholarURL) {
    try {
      
      String rawHTMLString = ExtractHtml.getHTML(googleScholarURL);
      String stringRegex = htmlRegex;
      Pattern patternObject = Pattern.compile(stringRegex);
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