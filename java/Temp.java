// Read a command-line argument
// Argument says where to write the output
// (file, console, network)
public class Temp {
    // Returns the name of the file to write to,
    // or null if we don't want to write to a file
    public static String getFilename(String[] args) { ... }

    // Returns the network location to write to,
    // or null if we don't want to write to a network
    // location
    public static NetworkLocation getNetwork(String[] args) { ... }
    
    public static int doComputation(Writer writer) {
	int x = 1 + 2;

	writer.writeThing("Intermediate result: " + x);

	int y = x * 3;

	return y + 4;
    }
    
    public static void main(String[] args) throws Exception {
	String filename = getFilename(args);
	NetworkLocation location = getNetwork(args);
	
	Writer writer;
	if (filename != null) {
	    // subtyping polymorphism
	    // can substitute a value of a more specific type
	    // for a more general one
	    writer = new FileWriter(filename);
	} else if (location != null) {
	    // subtyping polymorphism
	    writer = new NetworkWriter(location);
	} else {
	    // subtyping polymorphism
	    writer = new ConsoleWriter();
	}
	
	// do some computation
	int result = doComputation(writer);

	// ad-hoc polymorphism
	//   virtual dispatch / dynamic dispatch
	// which method is called is determined at runtime
	writer.writeThing(result);

	writer.close();
    }
}
