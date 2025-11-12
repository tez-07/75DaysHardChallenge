package TwoPointers;

import java.util.Arrays;

public class ReverseString {
    public String reverseStr(String s, int k) {
        
        char[] arr= new char[k];
        int j=0;
        if(k>0){
            for(int i=k-1; i>=0; i--){
                char ch = s.charAt(i);
                arr[j++] = ch;        
            }
        }
        
        int len = s.length();
        int diff = len -k;
        char[] arr2 = new char[diff];
        j =0;
        for(int i=k; i<s.length(); i++){
            char ch = s.charAt(i);
            arr2[j++] = ch;
        }

        String s1 = new String(arr);
        String s2 = new String(arr2);

        String s3 = s1+s2;
        System.out.println(s3);
        return s3;


    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.reverseStr("abcdefg", 2);
    }
}
