package String;

import java.util.HashMap;
import java.util.Map;

public class occurenceEachCharwithChar {
    
    public static void main(String[] args) {
        
        String str = "Jaavaaajava";
        char arr[] = str.toCharArray();    //created to convert str to char array
    
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: arr){                 
            map.put(ch, map.getOrDefault(ch, 0)+1);
            System.out.print(ch+":"+map.get(ch)+"  ");
            System.out.println();
        }

        for(Map.Entry<Character, Integer> m: map.entrySet()){
            char ch = m.getKey();
            int count = m.getValue();

            System.out.print(ch+ "=");
            for(int i=0; i<count; i++){
                System.out.print(ch);
            }
            System.out.println();
        }



    }
}
