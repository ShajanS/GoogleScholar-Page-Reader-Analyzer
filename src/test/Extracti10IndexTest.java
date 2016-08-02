package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * Test cases for Extracti10Index Class
 * @author Shajan Sivarajah
 *
 */
public class Extracti10IndexTest {
  String inputUrl;
  String i10Index;
  @Before
  public void setUp() throws Exception{
    inputUrl = "sample2.html";
    i10Index = extractor.Extracti10Index.extractIndexValue(inputUrl);
    
  }
  @Test
  public void testIndexValue() {
    assertTrue(i10Index.equals("9"));
    assertFalse(i10Index.equals("90"));
    assertFalse(i10Index.equals("09"));

  }
  
  @Test
  public void testEmptyIndexValue() {
    assertFalse(i10Index.equals(""));
    assertFalse(i10Index.equals("0"));
    assertFalse(i10Index.equals(null));

  }
}