import org.junit.Assert;
import org.junit.Test;

public class GuestListTest {

    @Test
    public void testAddDataToList() throws Exception {
        String data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        GuestList guestList = new GuestList();
        guestList.addRecords(data);
        Assert.assertEquals(guestList.filterRecord().getLastNameFirst()[0],"Ms Barrows,Julius");

    }
}