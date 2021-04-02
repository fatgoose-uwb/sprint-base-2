package Problem3;

public class MovieAction extends Movie {

    private final int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // TODO: add your code
        // required: use the 'super' keyword
    }

    public MovieAction(MovieAction anotherMovie) {
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
