package LEETCODE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeSort{
    public static void main(String[] args) {
        
        /*
            Remove zeros from both arrays (nums1, nums2)
            Merge non-zero elements
            Sort the final array
         */


        int[] nums1 = {-1,0,0,3,3,3,0,0,0}; 
        int[] nums2 = {2,5,6};
        int m = 9;
        int n = 3;

        int arr[] = new int[m+n];
        int index =0;

        //Merge non-zero elements
        for(int i=0; i<m; i++){
            if(nums1[i]!=0){
                arr[index++] = nums1[i];
            }
        }

        for(int i=0; i<n; i++){
            if(nums2[i]!=0){
                arr[index++] = nums2[i];                 //imp: starting index from new position
            }
        }

        System.out.println(Arrays.toString(arr));

        //Sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}