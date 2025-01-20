package JavaConcepts;

import java.util.*;
import java.util.ArrayList;

public class DayMapper {
    public static void main(String args[]){
        Map<String, String> dayMap=new LinkedHashMap<>();
        dayMap.put("Sun","Sunday");
        dayMap.put("Mon","Monday");
        dayMap.put("Tue","Tuesday");
        dayMap.put("Wed","Wednesday");
        dayMap.put("Thu","Thursday");
        dayMap.put("Fri","Friday");
        dayMap.put("Sat","Saturday");

        java.util.ArrayList<String> newDays= new ArrayList<>(Arrays.asList("Sun","Fri"));

        for (String newDay : newDays) {
            String day = dayMap.get(newDay);
            System.out.println(day);
        }

        List<String> keys = List.copyOf(dayMap.keySet());

        for (String key : keys) {
            for (String newDay : newDays) {
                if (newDay == key) {
                    System.out.println(keys.indexOf(key) + 1);
                }
            }
        }

    }
}
