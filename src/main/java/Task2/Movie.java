package Task2;

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
        // TODO: Implement this function
    }

    public Movie(Movie anotherMovie) {
        // TODO: Implement this function
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: Implement this function
        return true;   // TODO: placeholder. Replace with your code
    }
}
