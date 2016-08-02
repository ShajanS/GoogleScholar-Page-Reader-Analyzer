package extractor;
/**
 * Extracts the i10 Index value
 * @author Shajan Sivarajah
 *
 */
public class Extracti10Index {
  /**
   * extractIndexValue returns the i10-index value after 2009
   * @param googleScholarURL
   * @return Number of i10-index 
   */
  public static String extractIndexValue(String googleScholarURL) {
    // specific regex needed to fine the Author's Name
    String regexHtml = ">i10-index</a>" + "</td>" + 
        "<td class=\"cit-borderleft cit-data\">(.*?)</td>";
    // Call the regex compiler function to get the information located
    // at the regex html
    return extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);
    
   }
  
}