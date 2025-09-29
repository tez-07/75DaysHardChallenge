package LEETCODE;

import java.util.HashMap;
import java.util.Map;

public class MajorityE169 {
    public int majorityElement(int[] nums) {
        
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num: nums){
            //occurence of elements count on single line
            map.put(num, map.getOrDefault(num, 0)+1);
            
            if(map.get(num) > size/2 ){ //checks value how many times repeated
                return num;
            }
        }

        //visualize this to be clear

        return -1;
    }

    public static void main(String[] args) {
        MajorityE169 m = new MajorityE169();
        int nums[] = {3,2,3};
        int nums1[] = {2,2,1,1,1,2,2};
        System.out.println(m.majorityElement(nums));
        System.out.println(m.majorityElement(nums1));
    }
}
