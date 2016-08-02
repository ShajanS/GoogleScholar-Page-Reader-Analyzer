package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * Test cases for ExtractCitations Class
 * @author Shajan Sivarajah
 *
 */
public class ExtractCitationsTest {
  String inputUrl;
  String Citations;
  @Before
  public void setUp() throws Exception{
    inputUrl = "sample2.html";
    Citations = extractor.ExtractCitations.extractAllCitationValue(inputUrl);
    
  }
  @Test
  public void testCitationValue() {
    assertTrue(Citations.equals("263"));
    assertFalse(Citations.equals("37373737"));
    assertFalse(Citations.equals("0"));

  }
  
  @Test
  public void testEmptyCitationValue() {
    assertFalse(Citations.equals(""));
    assertFalse(Citations.equals("0"));
    assertFalse(Citations.equals(null));

  }
  

}
