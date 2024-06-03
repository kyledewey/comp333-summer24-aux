public class Nil implements ImmutableList {
    public Nil() {}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode

    public int length() {
	return 0;
    }
    
    public int sum() {
	return 0;
    }
    
    public ImmutableList append(final ImmutableList other) {
	return other;
    }
    
    public boolean contains(final int value) {
	return false;
    }

    public boolean isEmpty() {
	return true;
    }

    // [].addAmount(3) => []
    //    this: []
    public ImmutableList addAmount(int amount) {
	// return new Nil();
	return this;
    }

    // [].drop(2) => []
    public ImmutableList drop(int number) {
	// return new Nil();
	return this;
    }
} // Nil
    
