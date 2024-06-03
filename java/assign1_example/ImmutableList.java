public interface ImmutableList {
    public boolean equals(final Object other);
    public String toString();
    public int hashCode();

    public int length();
    public int sum(); // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other);
    public boolean contains(final int value);

    public boolean isEmpty();

    // [].addAmount(3) => []
    // [1, 2, 3].addAmount(1) => [2, 3, 4]
    // [7, 2].addAmount(3) => [10, 5]
    public ImmutableList addAmount(int amount);

    // [].drop(2) => []
    // [5].drop(1) => []
    // [5, 6].drop(1) => [6]
    // [5, 6, 7, 8].drop(2) => [7, 8]
    // [5, 6, 7, 8].drop(10) => []
    public ImmutableList drop(int number);
} // ImmutableList
