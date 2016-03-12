import org.junit.Test;
import personInfo.Age;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

public class AgeTest {

    @Test
    public void testSameAgeShouldBeEquals() throws Exception {
        Age age = new Age(20);
        Age otherAge = new Age(20);
        assertTrue(age.isGreaterThanAreEquals(otherAge));
        assertTrue(age.isGreaterThanAreEquals(age));

    }
    @Test
    public void testDiffrentAgeShouldNotBeEquals() throws Exception {
        Age age = new Age(20);
        Age otherAge = new Age(25);
        assertFalse(age.isGreaterThanAreEquals(otherAge));
    }
}