package LEETCODE;

import java.util.Arrays;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        
        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while (left<right) {
            while (left<right && !isVowel(arr[left])) left++;
            while (left<right && !isVowel(arr[right])) right--;

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        //System.out.println(Arrays.toString(arr));
        return new String(arr);
    }

    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }
}
