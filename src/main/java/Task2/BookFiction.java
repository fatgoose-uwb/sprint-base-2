package Task2;

public class BookFiction extends Book {

    private final int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        // TODO: Implement this function
        //  Required: must use the 'super' keyword
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        // TODO: Implement this function
        //  Required: must use the 'super' keyword
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // TODO: Implement this function
        return -1; // TODO: placeholder. Replace with your code.
    }
}
