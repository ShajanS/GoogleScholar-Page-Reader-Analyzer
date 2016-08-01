package Extractor;

public class ExtractPublicationTitle {

  public static String extractTitle(String googleScholarURL) {
    String regexHtml =
        "<td id=\"col-title\"><a href=\".*?\" "
        + "class=\"cit-dark-large-link\">(.*?)</a>";
    return Extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);

  }

}
