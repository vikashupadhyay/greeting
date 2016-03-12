import org.junit.Assert;
import org.junit.Test;
import personInfo.Gender;

public class GenderTest {

    @Test
    public void testTitleForName() throws Exception {
        Gender male = Gender.Male;
        Gender female = Gender.Female;
        Assert.assertEquals(male.toString(),"Mr");
        Assert.assertEquals(female.toString(),"Ms");

    }
}