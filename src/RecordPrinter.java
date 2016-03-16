
public class RecordPrinter {
    private final Object[] data;

    public RecordPrinter(Object[] personsData) {
        this.data =personsData;
    }
    public void print(){
        for (Object eachRecord : data) {
            System.out.println(eachRecord);
        }
    }
    public void printWithBorder(){
        for (Object eachRecord : data) {
            PrintingTemplate printingTemplate = new PrintingTemplate((String) eachRecord);
            System.out.println(printingTemplate.format());
        }
    }
}
