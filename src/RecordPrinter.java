
public class RecordPrinter {
    private final Object[] data;

    public RecordPrinter(Object[] personsData) {
        this.data =personsData;
    }
    public void print(){
        for (int i = 0; i <data.length ; i++) {
            System.out.println(data[i]);
        }
    }
}
