package Extractor;

public class ExtractCitationsPerPublication {

  public static void extractTotalCitations(String googleScholarURL) {
    String regexHtml = "<td id=\"col-citedby\">"
        + "<a class=\"cit-dark-link\" href=\".*?\">(.*?)</a></td>";
    Extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);

  }

}

