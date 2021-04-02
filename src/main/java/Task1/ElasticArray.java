package Task1;

import lombok.Getter;

public class ElasticArray<T> {
    @Getter
    private int capacity;
    @Getter
    private int chunkSize;
    private Object[] data;

    private static final int DEFAULT_CAPACITY = 50;
    private static final int DEFAULT_CHUNK_SIZE = 500;


    // Constructor
    public ElasticArray() {
        this(DEFAULT_CAPACITY, DEFAULT_CHUNK_SIZE);
    }

    // Another constructor
    public ElasticArray(int capacity, int chunkSize) {
        this.chunkSize = chunkSize;
        this.capacity = capacity;
    }

    /*
    TODO: fix bug in this code. Use the unit test as clue what the bug is.
     */
    public void write(int index, T value) {
        if (index < 0) {
            return;
        }

        /*
        if index is within the initial capacity, write directly
         */
        if (index < capacity) {
            data[index] = value;
            return;
        }

        /*
        otherwise, increase the capacity and then write
         */
        // calculate the new capacity
        while (index >= capacity) {
            capacity += chunkSize;
        }

        Object[] newData = new Object[capacity];

        // copy all the values from the current array
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        // add the new element at specified index
        newData[index] = value;

        // discard the old array
        data = newData;
    }

    @SuppressWarnings("unchecked")
    public T read(int index) {
        /*
        TODO: implement this function.
         */
        return (T) null; // TODO: this is a placeholder. Replace with your own code.
    }
}

