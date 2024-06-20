public class LessThan implements Predicate {
    private final int amount;
    public LessThan(int amount) {
	this.amount = amount;
    }
    public boolean check(int element) {
	return element < amount;
    }
}
