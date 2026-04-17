package JavaConcepts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CamelCaseConverterTest {
    @Test
    void toSnakeCaseConvertsWhitespaceToUnderscore() {
        assertEquals("my_name_is_ritika", CamelCaseConverter.toSnakeCase("my   name is ritika"));
    }

    @Test
    void toTitleCaseCapitalizesEachWord() {
        assertEquals("My Name Is Ritika", CamelCaseConverter.toTitleCase("my name is ritika"));
    }
}
