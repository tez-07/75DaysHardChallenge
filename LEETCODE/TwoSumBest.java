package LEETCODE;

import java.util.HashMap;

public class TwoSumBest {
    
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];              // what we need to reach target
            if (map.containsKey(diff)) {  
                
                // found the pair
                return new int[]{map.get(diff), i};   //map.get(complement): gets the key
            }
            map.put(nums[i], i);                            // store current number with its index
        }
        
        return new int[]{};
    }


    public static void main(String args[]){
        
        int nums[] = {2,7,11,15};
        TwoSum s = new TwoSum();
        int arr[] = s.twoSum(nums, 13);

        System.out.println("The indexes are: "+arr[0]+","+arr[1]);
    }
}
