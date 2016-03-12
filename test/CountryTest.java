import org.junit.Assert;
import org.junit.Test;
import personInfo.Country;

import static org.junit.Assert.assertFalse;

public class CountryTest {

    @Test
    public void testReturnTrueIfPersonBelongSameContry() throws Exception {
        Country country = new Country("India");
        Country otherCountry = new Country("India");
        Assert.assertTrue(country.equals(otherCountry));
        Assert.assertTrue(country.equals(country));

    }
    @Test
    public void testReturnFalseIfPersonBelongSameContry() throws Exception {
        Country country = new Country("India");
        Country otherCountry = new Country("Pakistan");
        assertFalse(country.equals(otherCountry));

    }
}