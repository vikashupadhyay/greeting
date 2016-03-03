import org.junit.Assert;
import org.junit.Test;

public class NameTest {

    @Test
    public void testGetFirstLastName() throws Exception {
        Name name = new Name("John", "Doe");
        Assert.assertEquals(name.getFirstlastName(),"John Doe");

    }
    @Test
    public void testGetLastFirstName() throws Exception {
        Name name = new Name("John", "Doe");
        Assert.assertEquals(name.getLastFirstName(),"Doe John");

    }
}