// Read a command-line argument
// Argument says where to write the output
// (file, console)

import java.io.File;
import java.io.FileOutputStream;

public class Temp {
    // Returns the name of the file to write to,
    // or null if we want to write to the console
    public static String getFilename(String[] args) {
	// NOT correct
	return null;
    }
    
    public static void main(String[] args) throws Exception {
	String filename = getFilename(args);

	// do some computation
	int result = 1 + 2;

	if (filename != null) {
	    File file = new File(filename);
	    FileOutputStream stream = new FileOutputStream(file);
	    stream.write(result);
	    stream.close();
	} else {
	    System.out.println(result);
	}
    }
}
