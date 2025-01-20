package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class ItemCostCalculator {
    public static void main(String args[]){
        Map<String,String> itemMap=new HashMap<String, String>();
        itemMap.put("copy","800");
        itemMap.put("pen","900");
        itemMap.put("pencil","1100");
        itemMap.put("paper","1700");
        itemMap.put("book","500");

        int budget = 5000;
        int total=0;

//        for (String key : keys){
//            String val = itemMap.get(key);
//            total=total+Integer.parseInt(val);
//        }

        for (String val : itemMap.values()){
            total=total+Integer.parseInt(val);
        }



        System.out.println("Total Cost: "+total);

        if(total>budget){
            int loss=total-budget;
            System.out.println("Loss: "+loss);
        } else if (total<budget) {
            int profit=budget-total;
            System.out.println("Profit: "+profit);
        }
        else{
            System.out.println("Equal");
        }


    }
}
