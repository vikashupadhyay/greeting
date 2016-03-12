import org.junit.Assert;
import org.junit.Test;

public class PrintingTemplateTest {
    @Test
    public void testToPrintInExpectedFormatOfFormalRecords() throws Exception {
        String text = "Mr Ram LaL\nNew Delhi, Karnatka\nIndia";
        PrintingTemplate printingTemplate = new PrintingTemplate(text);
        String expected ="+---------------------+"+"\n"+
                         "| Mr Ram LaL          |"+"\n"+
                         "|---------------------|"+"\n"+
                         "| New Delhi, Karnatka |"+"\n"+
                         "| India               |"+"\n"+
                         "+---------------------+";
        Assert.assertEquals(expected,printingTemplate.format());
    }
    @Test
    public void testToPrintInExpectedFormatOfInformalRecords() throws Exception {
        String text = "Ms Ram LaL\nNew Delhi, Karnatka\nIndia";
        PrintingTemplate printingTemplate = new PrintingTemplate(text);
        String expected ="+---------------------+"+"\n"+
                         "| Ms Ram LaL          |"+"\n"+
                         "|---------------------|"+"\n"+
                         "| New Delhi, Karnatka |"+"\n"+
                         "| India               |"+"\n"+
                         "+---------------------+";
        Assert.assertEquals(expected,printingTemplate.format());
    }
}