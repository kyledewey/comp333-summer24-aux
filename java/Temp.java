// Read a command-line argument
// Argument says where to write the output
// (file, console)

public class Temp {
    // Returns the name of the file to write to,
    // or null if we want to write to the console
    public static String getFilename(String[] args) {
	// NOT correct
	return null;
    }
    
    public static int doComputation(Writer writer) {
	int x = 1 + 2;

	writer.writeThing("Intermediate result: " + x);

	int y = x * 3;

	return y + 4;
    }
    
    public static void main(String[] args) throws Exception {
	String filename = getFilename(args);
	Writer writer = new Writer(filename);
	
	// do some computation
	int result = doComputation(writer);

	writer.writeThing(result);
	writer.close();
    }
}
