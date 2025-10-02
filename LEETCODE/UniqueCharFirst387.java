package LEETCODE;

//import java.util.HashMap;
//import java.util.Map;

class UniqueCharFirst387 {
    public int firstUniqChar(String s) {
        /*
        Map<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
         // Step 2: Find first character with frequency = 1
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
         */

        int arr[] = new int[26];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) -'a']++;
        }

        for(int i=0; i<s.length(); i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        UniqueCharFirst387 s = new UniqueCharFirst387();
        String str = "leetcode";
        int i = s.firstUniqChar(str);
        System.out.println(i);
    }
}