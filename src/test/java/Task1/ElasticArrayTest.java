package Task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElasticArrayTest {
    @Test
    public void testWriteWithinInitialCapacity() {
        final int testIdx = 0;
        final ElasticArray<Integer> integerArray = new ElasticArray<Integer>();

        integerArray.write(testIdx, 10);
        assertEquals(Integer.valueOf(10), integerArray.read(testIdx));

        ElasticArray<String> stringArray = new ElasticArray<String>();
        stringArray.write(testIdx, "hello");
        assertEquals("hello", stringArray.read(testIdx));

        ElasticArray<Float> floatArray = new ElasticArray<Float>();
        floatArray.write(testIdx, 0.00001f);
        assertEquals(Float.valueOf(0.00001f), floatArray.read(testIdx));
    }

    /*
    Exact the same test case as testWriteWithinInitialCapacity but without duplication
     */
    @Test
    public void testWriteWithinInitialCapacityRefactored() {
        // TODO: The test above (testWriteWithinInitialCapacity) has lots of duplications.
        //  For example: array creationarray.write, assertEquals.
        //  Refactor the test here with the same test cases (inputs, expected outputs) with as few duplications as possible.
        //  The refactored test should look like
        //  for (...) {
        //      ...
        //      ...
        //      array.write(index, valueToWrite);
        //      assertEquals(expectedValue, array.read(index));
        //  }

        assertTrue(false);  // TODO: this is a placeholder. Replace with your own code.
    }

    @Test
    public void testWriteTriggersResizeOnce() {
        final ElasticArray<Integer> array = new ElasticArray<Integer>();
        final int initCapacity = array.getCapacity();

        int testIdx = array.getCapacity();  // why is this going beyond the capacity?
        Integer testValue = 99;
        array.write(testIdx, testValue);

        // check for correct value written and read
        assertEquals(testValue, array.read(testIdx));

        // check for correct resizing
        assertEquals(initCapacity + array.getChunkSize(), array.getCapacity());
    }

    @Test
    public void testWriteTriggersResizingMultipleTimes() {
        final ElasticArray<Integer> array = new ElasticArray<Integer>();
        final int initCapacity = array.getCapacity();
        final Integer testValue = 99;

        for (int i = 0; i < 5; i++) {
            int testIdx = array.getCapacity();  // why is this going beyond the capacity?
            array.write(testIdx, testValue);

            // check for correct value written and read
            assertEquals(testValue, array.read(testIdx));

            // check for correct resizing
            assertEquals(
                    initCapacity + (long) (i + 1) * array.getChunkSize(),
                    array.getCapacity()
            );
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeWriteThrows() {
        ElasticArray<Integer> array = new ElasticArray<Integer>();
        array.write(-1, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testNegativeReadThrows() {
        ElasticArray<Float> array = new ElasticArray<Float>();
        array.read(-2);
    }

    @Test
    public void testReadWithoutWriteThrows() {
        ElasticArray<Boolean> array = new ElasticArray<Boolean>();
        int invalidIndex = array.getCapacity();  // out of bounds

        // Note: this is a different way of verifying exception being thrown without using annotation
        try {
            array.read(invalidIndex);
            fail("Expected IndexOutOfBoundsException to be thrown");
        } catch (IndexOutOfBoundsException ex) {
            assertEquals(
                    ex.getMessage(),
                    "index " + invalidIndex + " is too negative ;)"
            );
        }
    }

    @Test
    public void testCustomCapacityAndChunkSize() {
        /*
            TODO: implement the test verifying our elastic array works with customize capacity and chunk size.
             For example:
                final int customCapacity = 20;
                final int customChunkSize = 10;
                ElasticArray<String> array = new ElasticArray<>(customCapacity, customChunkSize);
                And your new tests should make basic verification such as read and write with and without resizing.
         */
        assertTrue(false);  // TODO: this is a placeholder. Replace with your own code.
    }
}
