package LEETCODE;

import java.util.Arrays;

public class Palindrome125 {
    public static void main(String[] args) {
        
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        
        String cleanStr = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        /*
        //Without using array
        int left =0;
        int right = cleanStr.length()-1;

        while(left<right){
            if(cleanStr.charAt(left)!=cleanStr.charAt(right)){
                return false;
            }
            left++; right--;
        }
        return true;
        */
        
        ///*
        //WITH ARRAYS
        int size = s.length();
        String[] oldstr = new String[size];
        String[] store = new String[size];
        
        //store all char
        for(int i=0; i<cleanStr.length(); i++){
            int count=0;
            oldstr[count] = String.valueOf(cleanStr.charAt(i));
            count++;
        }
        

        //reversing the str
        for(int i=cleanStr.length()-1; i>=0; i--){
            int count=0;
            store[count] = oldstr[i];
            count++;
        }


        if(Arrays.equals(oldstr, store)){
            return true;
        }else{
            return false;
        }
        // */
    }
}
