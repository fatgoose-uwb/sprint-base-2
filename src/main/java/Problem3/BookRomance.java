package Problem3;

public class BookRomance extends Book {

    private final int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        // homework
        // tip: use the 'super' keyword
    }

    public BookRomance(BookRomance anotherBook) {
        // homework
        // tip: use the 'super' keyword
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
    }
}
