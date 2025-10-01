package LEETCODE;

public class SubtractSumk560 {
    //Subarray → must be contiguous (elements next to each other in the array).
    /*
     * Will not run for testcases like: [1,-1,0]
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        if(nums.length!=0){
            
            for(int i=0; i<nums.length; i++){
                if(nums[i]==k){
                    count++;
                }
            }

            for(int i=0; i<nums.length-1; i++){
                int sum = nums[i] + nums[i+1];
                if(sum==k){
                    count++;
                }
            }

            return count;
        }
        return -1;
    }
}
