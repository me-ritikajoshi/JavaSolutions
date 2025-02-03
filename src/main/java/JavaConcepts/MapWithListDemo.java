package JavaConcepts;

import java.util.*;
import java.util.ArrayList;

public class MapWithListDemo {
    public static void main(String[] arg){

        Map<String, java.util.ArrayList<Integer>> classMap=new LinkedHashMap<>();
        classMap.put("class 1", new java.util.ArrayList<>(Arrays.asList(5,8,10,6)));
        classMap.put("class 2", new java.util.ArrayList<>(Arrays.asList(7,8,5,11,6)));
        classMap.put("class 3", new java.util.ArrayList<>(Arrays.asList(12,8,9,6)));
        classMap.put("class 4", new java.util.ArrayList<>(Arrays.asList(10,12,11,14)));

        System.out.println(classMap);

        Set<String> classList = classMap.keySet();

        for (String clas : classList){
            System.out.println(clas);
            ArrayList<Integer> eachClassStudent = classMap.get(clas);
            System.out.println("Total Students: "+ eachClassStudent.size());

            Collections.sort(eachClassStudent);
            System.out.println("........");
            System.out.println(Collections.max(eachClassStudent));
            System.out.println(Collections.min(eachClassStudent));
            System.out.println("........");


//            int highestAge=0;
//            for (int i = 0; i < eachClassStudent.size() ; i++) {
//                if(eachClassStudent.get(i)>highestAge){
//                    highestAge=eachClassStudent.get(i);
//                }
//            }
//            System.out.println("Highest Age: "+eachClassStudent.getLast());

//            int lowestAge=eachClassStudent.get(0);
//            for (int i = 0; i < eachClassStudent.size() ; i++) {
//                if(eachClassStudent.get(i)<lowestAge){
//                    lowestAge=eachClassStudent.get(i);
//                }
//            }
//            System.out.println("Lowest Age: "+eachClassStudent.getFirst());
            System.out.println("Sorted: "+eachClassStudent);

        }
    }
}
