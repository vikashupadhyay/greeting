import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {

    @Test
    public void testgetFirstlastNameRepresentsFormally() throws Exception {
        Name name = new Name("John", "Doe");
        assertEquals(name.getFirstlastName(),"John Doe");

    }
    @Test
    public void testgetLastFirstNameRepresentsInformally() throws Exception {
        Name name = new Name("John", "Doe");
        assertEquals(name.getLastFirstName(),"Doe,John");

    }
}