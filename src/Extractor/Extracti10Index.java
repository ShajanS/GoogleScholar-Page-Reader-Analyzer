package Extractor;

public class Extracti10Index {
  
  public static String extractIndexValue(String googleScholarURL) {
    String regexHtml = ">i10-index</a>" + "</td>" + 
        "<td class=\"cit-borderleft cit-data\">(.*?)</td>";
    return Extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);
    
   }
  
}