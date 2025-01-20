package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String args[]){
//        Map<Integer,String> m=new HashMap<Integer,String>();
//        m.put(1,"hi");
//        m.put(2,"hello");
//        m.put(3,"bye");
//
//        Map<Integer,String> m1=new HashMap<Integer,String>();
//        m1.put(1,"hi");
//        m1.put(2,"hello");
//        m1.put(3,"bye");
//        System.out.println("Map: " +m);
//
//        System.out.println(m.containsKey(2));
//        System.out.println(m.containsValue("bye"));
//        System.out.println(m.entrySet());
//        System.out.println(m.equals(m1));
//        System.out.println(m.get("hi"));

        Map<String,String> m=new HashMap<String,String>();
        m.put("firstName","Ritika");
        m.put("lastName","Joshi");
        m.put("country","Nepal");
        m.put("address","Maitidevi");
        m.put("city","Ktm");

//        System.out.println(m.get("firstName"));
//        System.out.println(m.get("lastName"));

        String fullName=m.get("firstName")+" "+m.get("lastName");
//        System.out.println(fullName);

        m.remove("firstName");
        m.remove("lastName");

        m.put("fullName",fullName);

        System.out.println(m);

        for (String key: m.keySet()){
            String val = m.get(key);
            m.put(key, val.toUpperCase());
        }
        System.out.println(m);

    }
}
