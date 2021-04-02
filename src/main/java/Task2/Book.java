package Task2;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // this is just so code would compile
    public Book() {
    }

    // copy constructor
    public Book(Book anotherBook) {
        // TODO: Implement this function
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: Implement this function
        return true;   // TODO: placeholder. Replace with your code
    }
}
