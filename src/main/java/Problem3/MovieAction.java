package Problem3;

public class MovieAction extends Movie {

    private final int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
    }

    public MovieAction(MovieAction anotherMovie) {
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
