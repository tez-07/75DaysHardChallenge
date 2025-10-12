import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        
        String pattern = "abba"; 
        String s = "dog dog cat dog";

        System.out.println(wPattern(pattern, s));
        
    }

    static boolean wPattern(String pattern, String s){

        String arr[] = s.split(" ");
        if(arr.length!= pattern.length()) return false;

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);            //taking char from pattern
            String words = arr[i];                  //taking words from string array

            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(words)){
                    return false;
                }
            }
            else{    
                map1.put(ch,words);
            }

            if(map2.containsKey(words)){
                if(!map2.get(words).equals(ch)){
                    return false;
                }
            }else{
                map2.put(words, ch);
            }
        }

        return true;
    }
}
