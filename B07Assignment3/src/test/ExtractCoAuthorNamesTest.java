package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for ExtractCoAuthorNames Class
 * 
 * @author Shajan Sivarajah
 *
 */
public class ExtractCoAuthorNamesTest {
  String inputUrl;
  int sizeAuthors;
  ArrayList<String> coAuthor;

  @Before
  public void setUp() throws Exception {
    inputUrl = "sample2.html";
    coAuthor = extractor.ExtractCoAuthorNames.extractCoAuthorNames(inputUrl);

  }

  @Test
  public void testCoAuthorListSize() {
    sizeAuthors = coAuthor.size();
    assertTrue(sizeAuthors == 14);
  }

  @Test
  public void testCoAuthorName() {
    String firstIndex = coAuthor.get(0);
    assertTrue(firstIndex.equals("Blair MacIntyre"));
  }

  @Test
  public void testEmptyNames() {
    assertFalse(coAuthor.equals(""));
    assertFalse(coAuthor.equals(null));

  }
}
