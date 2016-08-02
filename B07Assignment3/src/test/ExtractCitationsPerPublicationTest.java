package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for ExtractCitationsPerPublication Class
 * 
 * @author Shajan Sivarajah
 *
 */
public class ExtractCitationsPerPublicationTest {
  String inputUrl;
  String publicationCitation;

  @Before
  public void setUp() throws Exception {
    inputUrl = "sample2.html";
    publicationCitation = extractor.ExtractCitationsPerPublication
        .extractTotalCitations(inputUrl);

  }

  @Test
  public void testTotalCitations() {
    assertTrue(publicationCitation.equals("158"));
  }


  @Test
  public void testZeroCitations() {
    assertFalse(publicationCitation.equals("0"));

  }
}
