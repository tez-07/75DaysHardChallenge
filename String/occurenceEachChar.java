package String;

import java.util.HashMap;

public class occurenceEachChar {
    public static void main(String[] args) {
        
        String str = "Javalanguage";
        
        int arr[] = new int[256]; 
        
        for(char ch: str.toCharArray()){
            arr[ch]++;
        }

        /* loop written using regular for loop
         * for(int i=0; i<str.length; i++){
         *    char ch = str.charAt(i);
         *    arr[ch] ++;
         * }
         */

        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                //System.out.println((char)i +" "+arr[i]);
            }
        }
        


        //Using approach 2: using hasmap
        HashMap<Character, Integer> map = new HashMap<>();
        char arr1[] = str.toCharArray();

        for(char ch: arr1){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                int count = map.get(ch); //retrieve the previous count and add new one
                map.put(ch, count+1);
            }
        }

        System.out.println(map);
    }   
}
