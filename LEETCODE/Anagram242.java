package LEETCODE;

public class Anagram242 {
    public boolean isAnagram(String s, String t) {
        
        // -- Using ASCII count ---
        /*
            It increase the count of index of the array :
                count++ : for the String s
                count-- : for the String t
            Later, compare if the array count of each letter is 0 , then anagram.
         */
        int arr[] = new int[26];

        if(s.length()==t.length()){
            for(int i=0; i<s.length(); i++){
                arr[s.charAt(i)-'a']++;
                arr[t.charAt(i)-'a']--;
            }

            for(int c : arr){
                if(c!=0){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;


        /* --- Using HasMap----
            HashMap<Character, Integer> map = new HashMap<>();

            // Count characters in s
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // Subtract counts using t
            for (char c : t.toCharArray()) {
                if (!map.containsKey(c)) return false;
                map.put(c, map.get(c) - 1);
                if (map.get(c) < 0) return false;
            }
        */ 
    }

    public static void main(String args[]){
        Anagram242 s = new Anagram242();
        String str1 = "anagram";
        String str2 = "nagaram";
        Boolean b = s.isAnagram(str1, str2);
        System.out.println(b);
    }
}
