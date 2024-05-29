import java.io.File;
import java.io.FileOutputStream;

public class FileWriter implements Writer {
    private FileOutputStream stream;

    public FileWriter(String filename) {
	File file = new File(filename);
	stream = new FileOutputStream(file);
    }

    public void writeThing(String thing) {
	stream.write(thing);
    }
    
    public void close() {
	stream.close();
    }
}

