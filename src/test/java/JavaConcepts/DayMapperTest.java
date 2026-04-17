package JavaConcepts;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayMapperTest {
    @Test
    void expandAbbreviationsReturnsMatchingFullNames() {
        Map<String, String> dayMap = DayMapper.buildDayMap();

        List<String> result = DayMapper.expandAbbreviations(List.of("Sun", "Fri", "XXX"), dayMap);

        assertEquals(List.of("Sunday", "Friday"), result);
    }

    @Test
    void dayPositionsReturnsOneBasedIndexesInInputOrder() {
        Map<String, String> dayMap = DayMapper.buildDayMap();

        List<Integer> result = DayMapper.dayPositions(List.of("Sun", "Fri", "Sun"), dayMap);

        assertEquals(List.of(1, 6, 1), result);
    }
}
