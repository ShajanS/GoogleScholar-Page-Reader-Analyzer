package Extractor;

public class ExtractCitationsPerPublication {

  public static String extractTotalCitations(String googleScholarURL) {
    String regexHtml = "<td id=\"col-citedby\">"
        + "<a class=\"cit-dark-link\" href=\".*?\">(.*?)</a></td>";
    return Extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);

  }

}

