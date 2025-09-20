package String;

import java.util.Arrays;
import java.util.HashMap;
//import java.util.Map;

public class practice {
    
    public static void main(String[] args) {
        

        //Remove WhiteSpaces & specialCharacters
        String str = "Hello %$*)World!";
        String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(newStr);


        //Remove Duplicates
        String str1 = "Jaavayuuavaiopw";
        char arr[] = str1.toCharArray();
        String dupeStr = "";

        for(int i=0; i<str1.length(); i++){
            boolean dupe = false;
            for(int k=i+1; k<str1.length(); k++){
                if(arr[i]==arr[k]){
                    dupe = true;
                    break;
                }
            }
            if(!dupe){
                dupeStr +=arr[i];
            }
        }
        System.out.println(dupeStr);


        //Reverse a string : using charAt
        String str3 = "HelloWorld!";
        String revSt = "";

        for(int i=str3.length()-1; i>=0; i--){
            char ch = str3.charAt(i);
            revSt += ch;
        }
        System.out.println(revSt);

        //Reverse string using: array
        String rev="";
        String str4 = "Helloworld";
        char arr4[] = str4.toCharArray();
        
        for(int i=arr4.length-1; i>=0; i--){
            rev += arr4[i];
        }
        System.out.println(rev);



        //Sort Characters in a string
        String str5 = "Helloworld";
        char arr5[] = str5.toCharArray();
        Arrays.sort(arr5);
        System.out.println(arr5);


        for(int i=0; i<arr5.length; i++){
            char temp1 = 0;
            for(int j =i+1; j<arr5.length; j++){
                if(arr5[i]>arr5[j]){
                    temp1 = arr5[i];
                    arr5[i] = arr5[j];
                    arr5[j] = temp1;
                }
            }
        }
        System.out.println(arr5);
        


        //Count occurence
        //Checking array and later key is stored as ch and value is stored as count
        String str6 = "javaaajasu";
        char arr6[] = str6.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: arr6){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                int count6 = map.get(ch);
                map.put(ch, count6+1);
            }
        }
        System.out.println(map);


        


    }
}
