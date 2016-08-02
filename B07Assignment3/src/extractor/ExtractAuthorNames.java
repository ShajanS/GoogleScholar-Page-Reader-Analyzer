package extractor;

/**
 * Extracts the Authors Names at the given html code
 * 
 * @author Shajan Sivarajah
 *
 */
public class ExtractAuthorNames {

  /**
   * extractAuthorsName returns the name of the author
   * 
   * @param googleScholarURL
   * @return Author's Name
   */
  public static String extractAuthorsName(String googleScholarURL) {
    // specific regex needed to fine the Author's Name
    String regexHtml = "<span id=\"cit-name-display\" "
        + "class=\"cit-in-place-nohover\">(.*?)</span>";
    // Call the regex compiler function to get the information located
    // at the regex html
    return extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);
  }

}
