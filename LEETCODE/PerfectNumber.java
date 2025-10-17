package LEETCODE;

import java.util.ArrayList;

public class PerfectNumber {
    
    public static void main(String[] args) {
        int num = 29;
        System.out.println(checkPerfectNumber(num));
    }
    
    
    public static boolean checkPerfectNumber(int num) {
        
        if(num<=0)   return false;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<num; i++){
            
            int div = num%i;
            if(div==0){
                list.add(i);
            }
        }

        int sum =0;
        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
        }


        if(sum==num){
            return true;
        }

        return false;
    }
}
