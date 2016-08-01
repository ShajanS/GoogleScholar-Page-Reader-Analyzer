package extractor;

public class ExtractAuthorNames {
  
  public static String extractAuthorsName(String googleScholarURL) {
      String regexHtml = "<span id=\"cit-name-display\" "
          + "class=\"cit-in-place-nohover\">(.*?)</span>";
      return extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);
   }
  
}
