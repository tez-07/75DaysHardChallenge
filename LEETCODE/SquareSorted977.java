package LEETCODE;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquareSorted977 {
    
    public static void main(String[] args) {
    
        int nums1[] = {-4,-1,0,3,10};
        double nums[] = new double[nums1.length];
        
        for(int i=0; i<nums.length; i++){
            nums[i] = nums1[i];
        }
        System.out.println(nums);                   //int to double conversion



        double numSq;
        //Squares
        for(int i=0; i<nums.length; i++){
            numSq = Math.pow(nums[i], 2);
            nums[i] = numSq;
        }
        System.out.println(Arrays.toString(nums));  //After square , print double array
        


        //Sorting
        double temp=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
