package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    // this is just so code would compile
    public Movie() {
    }

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        // TODO: add your code
    }

    public Movie(Movie anotherMovie) {
        // TODO: add your code
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: add your code
        return true;   // TODO: place holder. Replace with your code
    }
}
