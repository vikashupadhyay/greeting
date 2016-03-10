import org.junit.Assert;
import org.junit.Test;

public class GuestListTest {

    @Test
    public void testAddDataToList() throws Exception {
        String data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        GuestList addingDataToPerson = new GuestList(data);
        addingDataToPerson.addData();
        Assert.assertEquals(addingDataToPerson.getGuest().size(),2);

    }
}