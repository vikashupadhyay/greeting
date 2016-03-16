import org.junit.Before;
import org.junit.Test;
import personInfo.*;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class RecordFilterTest {

    private Age age;
    LinkedList<Person> persons = new LinkedList<>();

    @Before
    public void setUp() throws Exception {
        City city = new City("West Shanna");
        State state = new State("Vermont");
        Country country = new Country("Bangladesh");
        Address address = new Address(city, state, country);
        Name name = new Name("Melody", "Dooley");
        age = new Age(20);
        Person firstPerson = new Person(name, Gender.Male, age, address);
        Person secondPerson = new Person(name, Gender.Male, age, address);
        persons.add(firstPerson);
        persons.add(secondPerson);

    }

    @Test
    public void testGetPersonInFirstLastPattern() throws Exception {
        RecordFilter records = new RecordFilter(persons);
        assertEquals(records.getfirstNameFirst()[0], "Mr Melody Dooley");

    }

    @Test
    public void testGetPersonInformally() throws Exception {
        RecordFilter records = new RecordFilter(persons);
        assertEquals(records.getLastNameFirst()[0], "Mr Dooley,Melody");

    }

    @Test
    public void testGetPersonFormallyOfGivenCountry() throws Exception {
        RecordFilter records = new RecordFilter(persons);
        Country country = new Country("Bangladesh");
        assertEquals(records.getfirstNameFirstOfGivenCountry(country)[0], "Mr Melody Dooley,Bangladesh");

    }

    @Test
    public void testGetPersonInformallyOfGivenCountry() throws Exception {
        RecordFilter records = new RecordFilter(persons);
        Country country = new Country("Bangladesh");
        assertEquals(records.getLastNameFirstOfGivenCountry(country)[0], "Mr Dooley,Melody,Bangladesh");

    }

    @Test
    public void testGetPersonFormallyOfGivenCountryAndAge() throws Exception {
        RecordFilter records = new RecordFilter(persons);
        Country country = new Country("Bangladesh");
        assertEquals(records.getFirstNameFirstGivenCountryAndAge(country, age)[0], "Mr Melody Dooley,Bangladesh,20");
        assertEquals(records.getFirstNameFirstGivenCountryAndAge(country, age)[1], "Mr Melody Dooley,Bangladesh,20");
        assertEquals(records.getFirstNameFirstGivenCountryAndAge(country, age).length,2);

    }


    @Test
    public void testGetPersonInformallyOfGivenCountryAndAge() throws Exception {
        RecordFilter records = new RecordFilter(persons);
        Country country = new Country("Bangladesh");
        assertEquals(records.getLastNameFirstOfGivenCountryAndAge(country, age)[0], "Mr Dooley,Melody,Bangladesh,20");

    }
    @Test
    public void testGetPersonFormallyWithAddress() throws Exception {
        RecordFilter records = new RecordFilter(persons);
        assertEquals(records.getFirstNameFirstWithAddress()[0],"Mr Melody Dooley\nWest Shanna, Vermont\nBangladesh");
    }
    @Test
    public void testGetPersonInformallyWithAddress() throws Exception {
        RecordFilter records = new RecordFilter(persons);
        assertEquals(records.getLastNameFirstWithAddress()[0],"Mr Dooley,Melody\nWest Shanna, Vermont\nBangladesh");
    }
}