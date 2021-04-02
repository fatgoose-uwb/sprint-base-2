package Task2;

public class BookRomance extends Book {

    private final int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        // TODO: Implement this function
        //  Required: must use the 'super' keyword
    }

    public BookRomance(BookRomance anotherBook) {
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
        return -1; // TODO: place holder. Replace with your code.
    }
}
