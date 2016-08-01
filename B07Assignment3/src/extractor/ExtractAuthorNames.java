package Extractor;

public class ExtractAuthorNames {
  
  public static String extractAuthorsName(String googleScholarURL) {
      String regexHtml = "<span id=\"cit-name-display\" "
          + "class=\"cit-in-place-nohover\">(.*?)</span>";
      return Extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);
   }
  
}
