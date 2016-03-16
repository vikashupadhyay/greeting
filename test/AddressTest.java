import org.junit.Test;
import personInfo.Address;
import personInfo.City;
import personInfo.Country;
import personInfo.State;

import static org.junit.Assert.assertTrue;

public class AddressTest {

    @Test
    public void testGiveCountry() throws Exception {
        City city = new City("bangalore");
        State state = new State("karnatka");
        Country country = new Country("India");
        Country otherCountry = new Country("India");
        Address address = new Address(city,state,country);
        assertTrue(address.isNationality(otherCountry));
    }
}