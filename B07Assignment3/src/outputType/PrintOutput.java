package outputType;


public class PrintOutput{
  
  
  public static String outputString(String args[]){
    String formatedString = "";
    int totalCoAuthors = 0;
    String inputFiles[] = args[0].split(",");
    for (String inputFile : inputFiles){
      String[] titles = Extractor.ExtractPublicationTitle.extractTitle(inputFile);
      formatedString += 
          "-----------------------------------------------------------------------\n"
      + "1. Name of Author:\n\t" + Extractor.ExtractAuthorNames.extractAuthorsName(inputFile) + "\n"
      + "2. Number of All Citations:\n\t" + Extractor.ExtractCitations.extractAllCitationValue(inputFile) + "\n"
      + "3. Number of i10-index after 2009:\n\t" + Extractor.Extracti10Index.extractIndexValue(inputFile) +"\n"
      + "4. Title of the first 3 publications:\n\t" + "1-   " + titles[0] +"\n"+ "\t2-   " + titles[1] +"\n"+"\t3-   " + titles[2] +"\n"
      + "5. Total paper citation (first 5 papers):\n\t" + Extractor.ExtractCitationsPerPublication.extractTotalCitations(inputFile) +"\n"
      + "6. Total Co-Authors:\n\t" + Extractor.ExtractCoAuthors.extractCoAuthorNames(inputFile) +"\n";
      
      totalCoAuthors += Integer.parseInt(Extractor.ExtractCoAuthors.extractCoAuthorNames(inputFile));

      if (inputFile == inputFiles[inputFiles.length-1]){
        formatedString +=  "-----------------------------------------------------------------------\n"
            + "7. Co-Author list sorted (Total: " + totalCoAuthors + ")";
        
      }
    }
    return formatedString;
    
  }
}