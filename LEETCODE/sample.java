package LEETCODE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sample{
    public static void main(String[] args) {
        
        int[] nums1 = {1,2,3,0,0,0}; 
        int[] nums2 = {2,5,6};
        int m = 6;
        int n = 3;

        int sizeNum1= nums1.length;
        for(int n1: nums1){
            if(n1==0){
                sizeNum1--;
            }
        }
        
        int sizeNum2= nums2.length;
        for(int n1: nums2){
            if(n1==0){
                sizeNum2--;
            }
        }

        System.out.println(sizeNum1);
        System.out.println(sizeNum2);
        

        int mergesize = sizeNum1 + sizeNum2;
        int arr[] = new int[mergesize];

        for(int i=0; i<nums1.length; i++){
            if(nums1[i]!=0){
                arr[i] += nums1[i];
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<nums2.length; i++){
            if(nums2[i]!=0){
                arr[sizeNum1++] = nums2[i];
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}