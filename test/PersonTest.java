import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Address address;
    private Name name;
    private City city;
    private State state;
    private Country country;

    @Before
    public void setUp() throws Exception {
        City city = new City("West Shanna");
        State state = new State("Vermont");
        Country country = new Country("Bangladesh");
        address = new Address(city, state, country);

    }

    @Test
    public void testPersonGiveNameFormally() throws Exception {
        Name name = new Name("Melody","Dooley");
        Age age = new Age(20);
        Person person = new Person(name,Gender.Male,age,address);
        assertEquals("Mr Melody Dooley",person.firstLastFormat());
    }
    @Test
    public void testPersonGiveNameInformally() throws Exception {
        Name name = new Name("Melody","Dooley");
        Age age = new Age(20);
        Person person = new Person(name,Gender.Male,age,address);
        assertEquals("Mr Dooley,Melody",person.lastFirstFormat());
    }
}