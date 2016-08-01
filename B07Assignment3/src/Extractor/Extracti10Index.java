package Extractor;

public class Extracti10Index {
  
  public static void extractIndexValue(String googleScholarURL) {
    String regexHtml = ">i10-index</a>" + "</td>" + 
        "<td class=\"cit-borderleft cit-data\">(.*?)</td>";
    Extractor.RegexCompiler.extractCodeInfo(regexHtml, googleScholarURL);
    
   }
  
}