package extractor;

/**
 * Extracts the total number of citations at the given html code
 * @author Shajan Sivarjah
 *
 */
public class ExtractCitations {
  /**
   * extractAllCitationValue is a method which returns the total # of citations
   * @param googleScholarURL
   * @return The total number of citations
   */
  public static String extractAllCitationValue(String googleScholarURL) {
    // specific regex needed to fine the total number of citations
    String regexHtml = ">Citations</a>" + "</td>" + 
  "<td class=\"cit-borderleft cit-data\">(.*?)</td>";
    // Call the regex compiler function to get the information located
    // at the regex html and return
    return extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);
    
   }
  
}