import Problem3.*;
import org.junit.Test;

import static org.junit.Assert.*;

// DO NOT REMOVE OR CHANGE ANYTHING HERE!
public class Problem3Test {
    @Test
    public void testMovieActionEquals() {
        String rating = "PG13";
        String title = "Pulp Fiction";

        MovieAction movie = new MovieAction(rating, title);
        MovieAction movieCopy = new MovieAction(movie);

        // things to consider: why is this "Equal"?
        assertTrue(movie.equals(movieCopy));

        MovieAction movieAnotherCopy = new MovieAction(rating, title);

        // things to consider: why is this "Not Equal"?
        assertFalse(movie.equals(movieAnotherCopy));
    }

    @Test
    public void testMovieComedyEquals() {
        String rating = "G";
        String title = "Toy Story 4";

        MovieComedy movie = new MovieComedy(rating, title);
        MovieComedy movieCopy = new MovieComedy(movie);

        assertTrue(movie.equals(movieCopy));

        movieCopy = new MovieComedy(rating, title);
        assertFalse(movie.equals(movieCopy));
    }

    @Test
    public void testMovieEquals() {
        Movie comedyMovie = new MovieComedy("R", "When Harry Met Sally...");
        Movie actionMovie = new MovieAction("R", "300");

        assertFalse(comedyMovie.equals(actionMovie));  // which equals is called here?
    }

    @Test
    public void testBookFictionEquals() {
        String title = "Sun Also Rises";
        String author = "Ernest Hemingway";
        String genre = "historical";

        BookFiction book = new BookFiction(title, author, genre);
        BookFiction bookCopy = new BookFiction(book);
        assertTrue(book.equals(bookCopy));

        bookCopy = new BookFiction(title, author, genre);
        assertFalse(book.equals(bookCopy));
    }

    @Test
    public void testBookRomanceEquals() {
        String title = "Love Story";
        String author = "Erich Segal";

        BookRomance romanceMovie = new BookRomance(title, author);
        BookRomance fc = new BookRomance(romanceMovie);
        assertTrue(romanceMovie.equals(fc));

        fc = new BookRomance(title, author);
        assertFalse(romanceMovie.equals(fc));
    }

    @Test
    public void testBookEquals() {
        String title = "Pride and Prejudice";
        String author = "Jane Austen";

        Book fictionBook = new BookFiction(title, author, "romance");
        Book romanceBook = new BookRomance(title, author);

        assertFalse(fictionBook.equals(romanceBook)); // why is this False? Are they not the same book?
    }

    @Test
    public void testBookFictionCalcLateFees() {
        Book bookFiction = new BookFiction("Murder on the Orient Express",
                "Agatha Christie", "crime novel");

        for (int numOfDaysPastDue = -5; numOfDaysPastDue < 5; numOfDaysPastDue++) {
            int fees = bookFiction.calcLateFees(numOfDaysPastDue);
            assertEquals(fees, Math.max(numOfDaysPastDue, 0) * bookFiction.getLateFeeInDollar());
        }
    }

    @Test
    public void testBookRomanceCalcLateFees() {
        Book bookRomance = new BookRomance("Gone with the Wind", "Margaret Mitchell");

        for (int numOfDaysPastDue = -5; numOfDaysPastDue < 5; numOfDaysPastDue++) {
            int fees = bookRomance.calcLateFees(numOfDaysPastDue);
            assertEquals(fees, Math.max(numOfDaysPastDue, 0) * bookRomance.getLateFeeInDollar());
        }
    }

    @Test
    public void testMovieActionCalcLateFees() {
        Movie movieAction = new MovieAction("PR-13", "Die Hard");

        for (int numOfDaysPastDue = -5; numOfDaysPastDue < 5; numOfDaysPastDue++) {
            int fees = movieAction.calcLateFees(numOfDaysPastDue);
            assertEquals(fees, Math.max(numOfDaysPastDue, 0) * movieAction.getLateFeeInDollar());
        }

        for (int numOfDaysPastDue = 5; numOfDaysPastDue <= 10; numOfDaysPastDue++) {
            int fees = movieAction.calcLateFees(numOfDaysPastDue);
            assertEquals(fees, 2 * numOfDaysPastDue * movieAction.getLateFeeInDollar());
        }
    }

    @Test
    public void testMovieComedyCalcLateFees() {
        Movie movieComedy = new MovieComedy("R", "Deadpool 3");

        for (int numOfDaysPastDue = -5; numOfDaysPastDue < 10; numOfDaysPastDue++) {
            int fees = movieComedy.calcLateFees(numOfDaysPastDue);
            assertEquals(fees, Math.max(numOfDaysPastDue, 0) * movieComedy.getLateFeeInDollar());
        }
    }

    @Test
    public void testStoreMediaCalcLateFees() {
        StoreMediaOperations[] storeMedias = new StoreMediaOperations[4];

        storeMedias[0] = new BookFiction("Vingt mille lieues sous les mers",
                "Jules Gabriel Verne", "sci-fi");
        storeMedias[1] = new BookRomance("A Room With A View", "E.M. Forster");
        storeMedias[2] = new MovieAction("PG-13", "Fast Five");
        storeMedias[3] = new MovieComedy("G", "Ratatouille");

        int dayMissed = 10;

        int lateFees = 0;
        for (StoreMediaOperations storeMediaOperations : storeMedias) {
            lateFees += storeMediaOperations.calcLateFees(dayMissed);
        }

        int expect = 0;
        for (StoreMediaOperations storeMediaOperations : storeMedias) {
            int factor = (storeMediaOperations instanceof MovieAction) ? 2 : 1;
            expect += storeMediaOperations.getLateFeeInDollar() * dayMissed * factor;
        }

        assertEquals(expect, lateFees);
    }
}
