package Extractor;

public class ExtractCitations {
  
  public static void extractCitationValue(String googleScholarURL) {
    String regexHtml = ">Citations</a>" + "</td>" + 
  "<td class=\"cit-borderleft cit-data\">(.*?)</td>";
    Extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);
    
   }
  
}