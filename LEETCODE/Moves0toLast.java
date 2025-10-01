    package LEETCODE;

import java.util.Arrays;

public class Moves0toLast {
        
    public void moveZeroes(int[] nums) {

        int size = nums.length;
        int arr[] = new int[size];
        int pos =0;

        //copy non zero elements
        for(int i=0; i<size; i++){
            if(nums[i]!=0){
                arr[pos] += nums[i];
                pos++;
            }
        }

        //store back the elements of arr into num, because we are returning it in void
        for(int i=0; i<size; i++){
            nums[i] = arr[i];
        }
    }

        public static void main(String args[]){
            int nums[] = {0,1,0,3,12};
            Moves0toLast s = new Moves0toLast();
            s.moveZeroes(nums);
            System.out.println(Arrays.toString(nums));
        }
    }
