package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class SelfDividing {
    
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();

        for(int i=left; i<=right; i++){
            int temp = i;
            boolean isselfDividing = true;

            while(temp>0){
                int div = temp%10;
                
                if(div==0 || i%div!=0){
                    isselfDividing = false;
                    break;
                }
                temp /= 10;
            }

            if(isselfDividing){
                list.add(i);
            }
        }

        return list;
    }
}
