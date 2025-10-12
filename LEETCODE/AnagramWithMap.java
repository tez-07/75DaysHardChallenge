import java.util.HashMap;
import java.util.Map;

public class AnagramWithMap {

    public static boolean isAnagram(String s, String t) {
        
        Map<Integer, Character> map = new HashMap<>();
        
        int count=0;
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            map.put(count,ch);
            count++;
        }
        System.out.println(map);
        

        if(map)
        return ;
    }

    public static void main(String[] args) {
        
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));
    }
}
