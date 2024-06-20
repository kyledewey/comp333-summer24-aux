public class MultiArg {
    public static void printStrings(String... strings) {
	for (final String s : strings) {
	    System.out.println(s);
	}
    }

    public static void main(String[] args) {
	printStrings("foo");
	printStrings("foo", "bar", "baz");
    }
}
