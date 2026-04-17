package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DayMapper {
    private DayMapper() {
    }

    public static Map<String, String> buildDayMap() {
        Map<String, String> dayMap = new LinkedHashMap<>();
        dayMap.put("Sun", "Sunday");
        dayMap.put("Mon", "Monday");
        dayMap.put("Tue", "Tuesday");
        dayMap.put("Wed", "Wednesday");
        dayMap.put("Thu", "Thursday");
        dayMap.put("Fri", "Friday");
        dayMap.put("Sat", "Saturday");
        return Collections.unmodifiableMap(dayMap);
    }

    public static List<String> expandAbbreviations(List<String> abbreviations, Map<String, String> dayMap) {
        Objects.requireNonNull(abbreviations, "abbreviations must not be null");
        Objects.requireNonNull(dayMap, "dayMap must not be null");

        List<String> fullNames = new ArrayList<>();
        for (String abbreviation : abbreviations) {
            String fullName = dayMap.get(abbreviation);
            if (fullName != null) {
                fullNames.add(fullName);
            }
        }
        return fullNames;
    }

    public static List<Integer> dayPositions(List<String> abbreviations, Map<String, String> dayMap) {
        Objects.requireNonNull(abbreviations, "abbreviations must not be null");
        Objects.requireNonNull(dayMap, "dayMap must not be null");

        List<String> keys = List.copyOf(dayMap.keySet());
        List<Integer> positions = new ArrayList<>();
        for (String abbreviation : abbreviations) {
            int index = keys.indexOf(abbreviation);
            if (index >= 0) {
                positions.add(index + 1);
            }
        }
        return positions;
    }

    public static void main(String[] args) {
        Map<String, String> dayMap = buildDayMap();
        List<String> newDays = new ArrayList<>(Arrays.asList("Sun", "Fri"));

        for (String day : expandAbbreviations(newDays, dayMap)) {
            System.out.println(day);
        }

        for (Integer position : dayPositions(newDays, dayMap)) {
            System.out.println(position);
        }
    }
}
