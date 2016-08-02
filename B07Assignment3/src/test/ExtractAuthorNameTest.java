package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * Test cases for ExtractAuthorNames Class
 * @author Shajan Sivarajah
 *
 */
public class ExtractAuthorNameTest {
  String inputUrl;
  String Name;
  @Before
  public void setUp() throws Exception{
    inputUrl = "sample2.html";
    Name = extractor.ExtractAuthorNames.extractAuthorsName(inputUrl);
    
  }
  @Test
  public void testAuthorNames() {
    assertTrue(Name.equals("Yan Xu"));
    assertFalse(Name.equals("Bobby Lee"));
  }
  
  @Test
  public void testemptyAuthorNames() {
    assertFalse(Name.equals(""));
    assertFalse(Name.equals(null));
  }

}
