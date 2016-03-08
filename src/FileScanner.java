import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileScanner {
    private final File file;
    private final int size;

    public FileScanner(File file,int size) {
        this.file = file;
        this.size =size;
    }
    public String readFile() {
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
        String chunk = new String(cbuf);
        return chunk;
    }
}
