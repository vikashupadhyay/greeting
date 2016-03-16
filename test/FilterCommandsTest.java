import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import personInfo.*;

import java.util.LinkedList;

public class FilterCommandsTest {
    LinkedList<Person> persons = new LinkedList<>();

    @Before
    public void setUp() throws Exception {
        City city = new City("West Shanna");
        State state = new State("Vermont");
        Country country = new Country("Bangladesh");
        Address address = new Address(city, state, country);
        Name name = new Name("Melody", "Dooley");
        Age age = new Age(20);
        Person firstPerson = new Person(name, Gender.Male, age, address);
        persons.add(firstPerson);

    }
    @Test
    public void testHashMapShouldReturnRecordFormally() throws Exception {
        String[] args = {"-fl","one.csv"};
        FilterCommands filterCommands = new FilterCommands(args);
        RecordFilter recordFilter = new RecordFilter(persons);
        filterCommands.recordAccToOption(recordFilter); // here is encapsulation leak...
        Assert.assertEquals("Mr Melody Dooley",filterCommands.recordsToPrint()[0]);
    }

}