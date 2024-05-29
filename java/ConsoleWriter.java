public class ConsoleWriter implements Writer {
    public ConsoleWriter() {}

    public void writeThing(String thing) {
	System.out.println(thing);
    }

    public void close() {}
}

