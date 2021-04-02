package Problem3;

public class BookRomance extends Book {

    private final int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        // TODO: add your code
        // required: use the 'super' keyword
    }

    public BookRomance(BookRomance anotherBook) {
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
