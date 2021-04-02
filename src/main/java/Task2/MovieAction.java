package Task2;

public class MovieAction extends Movie {

    private final int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // TODO: Implement this function
        //  Required: use the 'super' keyword
    }

    public MovieAction(MovieAction anotherMovie) {
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
        return -1; // TODO: placeholder. Replace with your code.
    }
}
