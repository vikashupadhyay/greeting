import org.junit.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testGiveCountry() throws Exception {
        Address address = new Address("bangalore","bangalore","India");
        Assert.assertEquals(address.getCountry(),"India");

    }
}