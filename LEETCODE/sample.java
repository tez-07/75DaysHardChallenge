package LEETCODE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sample{
    public static void main(String[] args) {
        
        int nums[] = {3,2,2,3};
        int val =3;
        int count=0;

        int arr[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
                break;
            }else{
                i++;
                arr[count] = nums[i];   
            }
        }
        

        System.out.println(Arrays.toString(arr));
    }
}