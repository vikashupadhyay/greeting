import org.junit.Test;

public class PersonTest {

    @Test
    public void testPresentationOfGuest() throws Exception {
        String[] add = {"lko","India"};
        Person person = new Person("vikas", "upadhyay", Gender.Male, add);
        System.out.println(person);
    }
}