import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testGetGuest() throws Exception {
        Address address = new Address("West Shanna", "Vermont", "Bangladesh");
        Name name = new Name("Melody","Dooley");
        Age age = new Age("20");
        Person person = new Person(name,Gender.Male,age,address);
        assertEquals("Mr Melody Dooley,Bangladesh",person.FL_templete());
    }
}