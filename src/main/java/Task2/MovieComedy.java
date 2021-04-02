package Task2;

public class MovieComedy extends Movie {
    private final int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        // TODO: Implement this function
        //  Required: use the 'super' keyword
    }

    public MovieComedy(MovieComedy anotherMovie) {
        // TODO: Implement this function
        //  Required: use the 'super' keyword
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
