import java.io.File;
import java.io.FileOutputStream;

public class Writer {
    private FileOutputStream stream;

    public Writer(String filename) {
	if (filename != null) {
	    File file = new File(filename);
	    stream = new FileOutputStream(file);
	} else {
	    stream = null;
	}
    }
    
    public void writeThing(String thing) {
	if (stream != null) {
	    stream.write(thing);
	} else {
	    System.out.println(thing);
	}	
    }

    public void close() {
	if (stream != null) {
	    stream.close();
	}
    }
}
