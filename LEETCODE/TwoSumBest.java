package LEETCODE;

import java.util.HashMap;

public class TwoSumBest {
    
    public int[] twoSum(int[] nums, int target) {
        
        /*
            Start with an empty map.
            i = 0 → nums[0] = 2
            complement = 13 - 2 = 11
            11 not in map → put (2 → 0)
            map: {2=0}

            i = 1 → nums[1] = 7
            complement = 13 - 7 = 6
            6 not in map → put (7 → 1)
            map: {2=0, 7=1}
            
            i = 2 → nums[2] = 11
            complement = 13 - 11 = 2
            ✅ 2 is in map (map.get(2) = 0)
            return {map.get(2), i} → {0, 2} 

         */

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
