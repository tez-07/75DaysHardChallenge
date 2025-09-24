package LEETCODE;

/*
 Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]   
Output: 4

Example 3:
Input: nums = [1]   
Output: 1
 */



class Array136 {
    public int singleNumber(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            boolean single = true;
            for(int j=0; j<nums.length; j++){
                if(i!=j && nums[i]==nums[j]){
                    single = false;
                    break;
                }
            }
            if(single == true){
                return nums[i];
            }
        }
        return -1;          // Used when there is nothing to return
    }

    public static void main(String args[]){
        Array136 s = new Array136();
        
        int nums[] = {4,1,2,1,2};
        int cl = s.singleNumber(nums);
        System.out.println("Single Number in the array is: "+cl);
    }
}