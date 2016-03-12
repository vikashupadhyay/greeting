import org.junit.Before;
import org.junit.Test;
import personInfo.*;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class RecordFilterTest {

    private Address address;
    private Name name;
    private Age age;
    private Person person;
    LinkedList<Person> persons = new LinkedList<Person>();

    @Before
    public void setUp() throws Exception {
        City city = new City("West Shanna");
        State state = new State("Vermont");
        Country country = new Country("Bangladesh");
        address = new Address(city,state,country);
        name = new Name("Melody", "Dooley");
        age = new Age(20);
        Person firstPerson = new Person(name, Gender.Male, age, address);
        Person secondPerson = new Person(name, Gender.Male, age, address);
        persons.add(firstPerson);
        persons.add(secondPerson);

    }

    @Test
    public void testGeTPersonInFirstLastPattern() throws Exception {
        RecordFilter getData = new RecordFilter(persons);
        assertEquals(getData.getfirstNameFirst()[0], "Mr Melody Dooley");

    }

    @Test
    public void testGeTPersonInLastFirstPattern() throws Exception {
        RecordFilter getData = new RecordFilter(persons);
        assertEquals(getData.getLastNameFirst()[0], "Mr Dooley,Melody");

    }

    @Test
    public void testGetPersonsInFlPatternOfGivenCountry() throws Exception {
        RecordFilter getData = new RecordFilter(persons);
        Country country = new Country("Bangladesh");
        assertEquals(getData.getfirstNameFirstOfGivenCountry(country)[0], "Mr Melody Dooley,Bangladesh");

    }

    @Test
    public void testGetPersonsInLfPatternOfGivenCountry() throws Exception {
        RecordFilter getData = new RecordFilter(persons);
        Country country = new Country("Bangladesh");
        assertEquals(getData.getLastNameFirstOfGivenCountry(country)[0], "Mr Dooley,Melody,Bangladesh");

    }

    @Test
    public void testGetPersonsInFlPatternOfGivenCountryAndAge() throws Exception {
        RecordFilter getData = new RecordFilter(persons);
        Country country = new Country("Bangladesh");
        assertEquals(getData.getFirstNameFirstGivenCountryAndAge(country, age)[0], "Mr Melody Dooley,Bangladesh,20");

    }

    @Test
    public void testGetPersonsInLfPatternOfGivenCountryAndAge() throws Exception {
        RecordFilter getData = new RecordFilter(persons);
        Country country = new Country("Bangladesh");
        assertEquals(getData.getLastNameFirstOfGivenCountryAndAge(country, age)[0], "Mr Dooley,Melody,Bangladesh,20");

    }
}