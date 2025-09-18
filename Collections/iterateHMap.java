package Collections;

import java.util.HashMap;
import java.util.Map;

public class iterateHMap {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>(Map.of(
            "India", 1500,
            "China", 3532,
            "Belgium", 2332
        ));


        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+ " "+e.getValue());
        }
    }
}
