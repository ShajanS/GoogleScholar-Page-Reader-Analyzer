package Extractor;

public class ExtractAuthorNames {
  
  public static void extractAuthorsName(String googleScholarURL) {
      String regexHtml = "<span id=\"cit-name-display\" "
          + "class=\"cit-in-place-nohover\">(.*?)</span>";
      Extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);
   }
  
}
