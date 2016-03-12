
public class RecordPrinter {
    private final Object[] data;

    public RecordPrinter(Object[] personsData) {
        this.data =personsData;
    }
    public void print(){
        System.out.println(data);
        for (Object eachRecord : data) {
            System.out.println(eachRecord);
        }
    }
}
