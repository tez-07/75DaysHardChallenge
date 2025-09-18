package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class sortHMapValue {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 3);
        map.put("USA",  1);
        map.put("Canada", 2);
        map.put("France",  4);
    
        System.out.println("Before sorting in HashMap: "+map);

        //Convert entry set to list 
        //Map.Entry: A Set of key-value pairs (Map.Entry<K,V> objects) from the HashMap
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        System.out.println("Before sorting in list: "+list);

        list.sort(Map.Entry.comparingByValue());                                    //Ascending order
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());        //Descending order

        System.out.println("After sorting in list: "+list);

        //To maintain insertion order LinkedHashmap needs to be used. Hashmap has no order.
        LinkedHashMap<String, Integer> lhasmap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> e: list){
            lhasmap.put(e.getKey(), e.getValue());
        }

        System.out.print("After sorting in HashMap: "+lhasmap+" ");

    }
}
