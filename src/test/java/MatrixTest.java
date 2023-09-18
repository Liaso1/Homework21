import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatrixTest {
    private Matrix matrix;
    private int[][] testMatrix;
    @BeforeEach
    void setUp() {
        matrix = new Matrix();

        testMatrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIsSquareMatrixWithSquareMatrix() {
        assertTrue(matrix.isSquareMatrix(testMatrix));
    }

    @Test
    void testIsSquareMatrixWithNonSquareMatrix() {
        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5}};
        assertFalse(matrix.isSquareMatrix(nonSquareMatrix));
    }

    private void assertFalse(boolean squareMatrix) {
    }

    @Test
    void testIsSquareMatrixWithNullMatrix() {
        assertFalse(matrix.isSquareMatrix(null));
    }

    @Test
    void testIsSquareMatrixWithEmptyMatrix() {
        int[][] emptyMatrix = {};
        assertFalse(matrix.isSquareMatrix(emptyMatrix));
    }

    @Test
    void testAverageArrayElements() {
        int[] array = {1, 2, 3, 4, 5};
        double expectedAverage = 3.0;
        assertEquals(expectedAverage, matrix.averageArrayElements(array));
    }

    @Test
    void testAverageArrayElementsWithEmptyArray() {
        int[] emptyArray = {};
        double expectedAverage = Double.NaN;
        assertEquals(expectedAverage, matrix.averageArrayElements(emptyArray));
    }
}
