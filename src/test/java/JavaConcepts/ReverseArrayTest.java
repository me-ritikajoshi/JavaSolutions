package JavaConcepts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReverseArrayTest {
    @Test
    void reverseInPlaceReversesArray() {
        int[] values = {1, 2, 3, 4, 5};

        ReverseArray.reverseInPlace(values);

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, values);
    }

    @Test
    void reverseInPlaceRejectsNullInput() {
        assertThrows(NullPointerException.class, () -> ReverseArray.reverseInPlace(null));
    }
}
