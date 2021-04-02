package Problem3;

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
        // TODO: add your code
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: add your code
        return true;   // TODO: place holder. Replace with your code
    }
}
