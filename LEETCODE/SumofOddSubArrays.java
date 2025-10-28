package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class SumofOddSubArrays {
    
    public static void main(String[] args) {
        int arr[] = {1,2};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        int sum =0;

        //For all ith place odd
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
            sum += list.get(i);
        }

        for(int i=0; i<arr.length; i++){
            
            if(i%2!=0){
                sum += list.get(i);
            }
        }
        
        

        return sum;
    }
}
