import org.junit.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testGiveCountry() throws Exception {
        String[] a = {"bangalore","India"};
        Address address = new Address(a);
        Assert.assertEquals(address.getCountry(),"India");

    }
}