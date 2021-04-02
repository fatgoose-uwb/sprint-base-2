package Problem3;

public class BookFiction extends Book {

    private final int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        // TODO: add your code
        // required: use the 'super' keyword
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        // TODO: add your code
        // required: use the 'super' keyword
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // TODO: add your code
        return -1; // TODO: place holder. Replace with your code.
    }
}
