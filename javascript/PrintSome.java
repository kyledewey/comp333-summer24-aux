public class PrintSome {
    public static void printSome(int[] array, Predicate predicate) {
	for (int index = 0; index < array.length; index++) {
	    int element = array[index];
	    if (predicate.check(element)) {
		System.out.println(element);
	    }
	}
    }

    public static void printAll(int[] array) {
	// wanted: pass a Predicate object where check always returns true 
	printSome(array, new AlwaysTrue());
    }

    public static void printAllLessThan(int[] array, int amount) {
	printSome(array, new LessThan(amount));
    }
}
