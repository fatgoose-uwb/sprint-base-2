import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem1Test {

    private static final int RED = 0;
    private static final int WHITE = 1;
    private static final int BLUE = 2;

    @Test
    public void testSortColor() {
        int[][] inputs = {
                {RED, WHITE, BLUE},
                {BLUE, WHITE, RED},
                {RED, WHITE, BLUE},
                {BLUE, BLUE, WHITE, WHITE, RED},
                {BLUE, RED, WHITE, BLUE, RED},
                {BLUE, BLUE, WHITE, WHITE, RED, RED},
                {WHITE, BLUE, RED, WHITE, BLUE, RED},
                {BLUE, RED, BLUE, WHITE, WHITE, RED},
                {BLUE, RED, WHITE},
                {RED, BLUE, WHITE, RED, WHITE, BLUE, RED},  // The Kevin Test Case
        };

        int[][] expects = {
                {RED, WHITE, BLUE},
                {RED, WHITE, BLUE},
                {RED, WHITE, BLUE},
                {RED, WHITE, WHITE, BLUE, BLUE},
                {RED, RED, WHITE, BLUE, BLUE},
                {RED, RED, WHITE, WHITE, BLUE, BLUE},
                {RED, RED, WHITE, WHITE, BLUE, BLUE},
                {RED, RED, WHITE, WHITE, BLUE, BLUE},
                {RED, WHITE, BLUE},
                {RED, RED, RED, WHITE, WHITE, BLUE, BLUE},  // The Kevin Test Case
        };

        for (int i = 0; i < inputs.length; i++) {
            Problem1.colorSort(inputs[i]);
            assertArrayEquals(expects[i], inputs[i]);
        }
    }
}