package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for ExtractPublicationTitle Class
 * 
 * @author Shajan Sivarajah
 *
 */
public class ExtractPublicationTitleTest {
  String inputUrl;
  int sizePublications;
  String[] publicationTitle;

  @Before
  public void setUp() throws Exception {
    inputUrl = "sample2.html";
    publicationTitle = extractor.ExtractPublicationTitle.extractTitle(inputUrl);

  }

  @Test
  public void testPublicationSize() {
    sizePublications = publicationTitle.length;
    assertTrue(sizePublications == 3);
  }

  @Test
  public void testPublicationTitle() {
    String firstIndex = publicationTitle[0];
    assertTrue(
        firstIndex.equals("Face-tracking as an augmented input in video games: "
            + "enhancing presence, role-playing and control"));
  }

  @Test
  public void testEmptyTitles() {
    assertFalse(publicationTitle.equals(""));
    assertFalse(publicationTitle.equals(null));

  }
}
