import java.io.IOException;

public class LabelPrinter {
    public static void main(String[] args) throws IOException {
        FileScanner fileScanner = new FileScanner(args);
        String record = fileScanner.readFile();
        GuestList guestList = new GuestList();
        guestList.addRecords(record);
        RecordFilter recordFilter = guestList.filterRecord();
        String option=args[0];

    }

}

