package Extractor;

public class ExtractPublicationTitle {

  public static void extractTitle(String googleScholarURL) {
    String regexHtml =
        "<td id=\"col-title\"><a href=\".*?\" "
        + "class=\"cit-dark-large-link\">(.*?)</a>";
    Extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);

  }

}
