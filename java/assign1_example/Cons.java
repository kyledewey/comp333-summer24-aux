public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
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
	return false;
    }

    // [7, 2].addAmount(3) => [10, 5]
    // new Cons(7, new Cons(2, new Nil())).addAmount(3) =>
    //   new Cons(10, new Cons(5, new Nil()))
    public ImmutableList addAmount(int amount) {
	// amount: 3
	// this: [7, 2]
	// head: 7
	// tail: [2]
	// expected return value: [10, 5]
	
	// smaller list: [2] (tail)
	// [2].addAmount(3) => [5]
	// rest: [5]
	ImmutableList rest = tail.addAmount(amount);

	int added = head + amount;
	// added: 10

	return new Cons(added, rest);

	//return new Cons(head + amount, tail.addAmount(amount));
    }

    // [5, 6, 7, 8].drop(2) => [7, 8]
    // Cons(5, Cons(6, Cons(7, Cons(8, Nil()))))
    //
    // [1, 2, 3].drop(0) => [1, 2, 3]
    public ImmutableList drop(int number) {
	// number: 2
	// this: [5, 6, 7, 8]
	// head: 5
	// tail: [6, 7, 8]
	// expected return value: [7, 8]
	
	// [6, 7, 8].drop(1) => [7, 8]
	// rest: [7, 8]
	if (number > 0) {
	    ImmutableList rest = tail.drop(number - 1);
	    return rest;
	} else {
	    return this;
	}
    }
} // Cons
