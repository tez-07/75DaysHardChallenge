package Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hmap {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 1500);
        map.put("USA", 1500);
        map.put("China", 1800);
        map.put("Poland", 200);

        
        map.put("Poland", 140);     // Updation in Poland as key already exists. No duplication of key.
        System.out.println(map);

        /*
        Scanner sc = new Scanner(System.in);
        String key1 = sc.next();

        //search
        if(map.containsKey(key1)){
            System.out.println("key is present in the map");
            System.out.println("China: "+map.get(key1));            //to retrieve the value  map.get()
        }else{
            System.out.println("key isn't present in the map");
            System.out.println("Value :"+map.get(key1));
        }
         */

        //Iteration in HashMap
        //Used to retrive keys and values using entrySet()
        for(Map.Entry<String,Integer> e : map.entrySet()){
             System.out.print(e.getKey()+" ");
             System.out.print(e.getValue()+",");
        }

        //retrieving key and values using set
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+" "+map.get(key));
        }

        //Delete
        map.remove("Poland");
        System.out.println(map);


    }
}
