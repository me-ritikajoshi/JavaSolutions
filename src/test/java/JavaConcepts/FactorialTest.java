package JavaConcepts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    void factorialCalculatesExpectedValues() {
        assertEquals(1L, Factorial.factorial(0));
        assertEquals(120L, Factorial.factorial(5));
    }

    @Test
    void factorialRejectsNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}
