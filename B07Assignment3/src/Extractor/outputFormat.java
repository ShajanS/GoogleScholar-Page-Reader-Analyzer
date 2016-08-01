package Extractor;


public class outputFormat{
  
  
  public static String outputString(String args[]){
    String inputFiles[] = args[0].split(",");
    for (String inputFile : inputFiles){
      String formatedString = 
          "-----------------------------------------------------------------------\n"
      + "1. Name of Author:\n\t" + Extractor.ExtractAuthorNames.extractAuthorsName(inputFile) + "\n"
      + "2. Number of All Citations:\n\t" + Extractor.ExtractCitations.extractCitationValue(inputFile) + "\n"
      + "3. Number of i10-index after 2009:\n\t" + Extractor.Extracti10Index.extractIndexValue(inputFile) +"\n"
      + "4. Title of the first 3 publications:\n\t" + Extractor.ExtractPublicationTitle.extractTitle(inputFile) +"\n"
      + "5. Total paper citation (first 5 papers):\n\t" + Extractor.ExtractCitationsPerPublication.extractTotalCitations(inputFile) +"\n"
      + "6. Total Co-Authors:\n\t" + Extractor.ExtractCoAuthors.extractCoAuthorNames(inputFile) +"\n";
 
      
      System.out.print(formatedString);

    }
    return null;
    
  }
}