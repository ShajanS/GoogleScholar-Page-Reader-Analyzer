package Extractor;

public class ExtractCitations {
  
  public static String extractAllCitationValue(String googleScholarURL) {
    String regexHtml = ">Citations</a>" + "</td>" + 
  "<td class=\"cit-borderleft cit-data\">(.*?)</td>";
    return Extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);
    
   }
  
}