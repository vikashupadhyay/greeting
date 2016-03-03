import org.junit.Assert;
import org.junit.Test;

public class GenderTest {

    @Test
    public void testTitleForName() throws Exception {
        Gender male = Gender.Male;
        Gender female = Gender.Female;
        Assert.assertEquals(male.title(),"Mr");
        Assert.assertEquals(female.title(),"Ms");

    }
}