package LEETCODE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sample{
    public static void main(String[] args) {
        
        int x =121;
        System.out.println(isPalindrome(x));
        
    }

    static boolean isPalindrome(int x) {
        
        if(x<=0)    return false;

        int num = x;
        int reverse = 0;
        while(num>0){
            int r = num % 10;
            reverse = reverse*10 + r;
            num = num / 10;
        }

        if(x==reverse){
            return true;
        }
        return false;
    }
}