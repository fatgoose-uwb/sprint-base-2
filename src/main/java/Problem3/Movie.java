package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        // homework
    }

    public Movie(Movie anotherMovie) {
        // homework
    }

    @Override
    public boolean equals(Object obj) {
        // homework
    }
}
