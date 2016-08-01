package outputType;


public class PrintOutput{
  
  
  public static String outputString(String args[]){
    String formatedString = "";
    int totalCoAuthors = 0;
    String inputFiles[] = args[0].split(",");
    for (String inputFile : inputFiles){
      String[] titles = extractor.ExtractPublicationTitle.extractTitle(inputFile);
      formatedString += 
          "-----------------------------------------------------------------------\n"
      + "1. Name of Author:\n\t" + extractor.ExtractAuthorNames.extractAuthorsName(inputFile) + "\n"
      + "2. Number of All Citations:\n\t" + extractor.ExtractCitations.extractAllCitationValue(inputFile) + "\n"
      + "3. Number of i10-index after 2009:\n\t" + extractor.Extracti10Index.extractIndexValue(inputFile) +"\n"
      + "4. Title of the first 3 publications:\n\t" + "1-   " + titles[0] +"\n"+ "\t2-   " + titles[1] +"\n"+"\t3-   " + titles[2] +"\n"
      + "5. Total paper citation (first 5 papers):\n\t" + extractor.ExtractCitationsPerPublication.extractTotalCitations(inputFile) +"\n"
      + "6. Total Co-Authors:\n\t" + extractor.ExtractCoAuthors.extractCoAuthorNames(inputFile) +"\n";
      
      totalCoAuthors += Integer.parseInt(extractor.ExtractCoAuthors.extractCoAuthorNames(inputFile));

      if (inputFile == inputFiles[inputFiles.length-1]){
        formatedString +=  "-----------------------------------------------------------------------\n"
            + "7. Co-Author list sorted (Total: " + totalCoAuthors + ")";
        
      }
    }
    return formatedString;
    
  }
}