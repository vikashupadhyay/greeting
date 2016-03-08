import org.junit.Assert;
import org.junit.Test;

public class AddingDataToPersonTest {

    @Test
    public void testAddDataToList() throws Exception {
        String data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        AddingDataToPerson addingDataToPerson = new AddingDataToPerson(data);
        addingDataToPerson.addData();
        Assert.assertEquals(addingDataToPerson.getPersons().size(),2);

    }
}