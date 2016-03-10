import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileScanner {

    private String[] args;

    public FileScanner(String[] args) {

        this.args = args;
    }
    public String readFile() {
        File file = new File(args[args.length - 1]);
        int size = (int) file.length();
        char[] cbuf = new char[size];
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fileReader.read(cbuf, 0, size);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String records = new String(cbuf);
        return records;
    }
}
