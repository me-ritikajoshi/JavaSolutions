package JavaConcepts;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayListOperationsTest {
    @Test
    void numericAggregationMethodsReturnExpectedValues() {
        List<Integer> values = List.of(1, 2, 3, 4, 5, 5);

        assertEquals(5, ArrayListOperations.largest(values));
        assertEquals(1, ArrayListOperations.smallest(values));
        assertEquals(20, ArrayListOperations.sum(values));
        assertEquals(20d / 6d, ArrayListOperations.average(values));
        assertEquals(2, ArrayListOperations.countOccurrences(values, 5));
    }

    @Test
    void listShapeMethodsReturnExpectedValues() {
        List<Integer> first = List.of(1, 2, 2, 3);
        List<Integer> second = List.of(4, 5);

        assertEquals(List.of(1, 2, 3), ArrayListOperations.removeDuplicatesPreserveOrder(first));
        assertEquals(List.of(1, 2, 2, 3, 4, 5), ArrayListOperations.merge(first, second));
    }
}
