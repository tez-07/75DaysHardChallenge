package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormofInt {

    public static void main(String[] args) {
        
        int num[] = {2,1,5};
        System.out.println(addToArrayForm(num, 1806));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> list = new ArrayList<>();

        int carry=0;
        for(int i=num.length-1 ; i>=0; i--){
            
            int lastD = k%10;
            
            int sum = num[i] + lastD + carry;
            if(sum<10){
                list.add(sum);
                carry =0;                       //important need to reset
            }else{
                int lastDD = sum%10;
                list.add(lastDD);
                carry = sum/10;
            }

            k /= 10;
        }
        

        while (k>0) {
            int sum = (k%10) + carry;
            list.add(sum%10);
            carry /= 10;
            k /=10;

        }

        //leftover carry
        if(carry>0){
            list.add(carry);
        }

        Collections.reverse(list);

        return list;
    }
    
}
