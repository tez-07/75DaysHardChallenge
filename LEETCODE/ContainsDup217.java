package LEETCODE;

import java.util.HashSet;
import java.util.Set;

public class ContainsDup217 {
    public boolean containsDuplicate(int[] nums) {
        
        int size = nums.length;

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<size; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDup217 c = new ContainsDup217();
        int num1[] = {1,2,3,1};
        int num2[] = {1,2,3};
        int num3[] = {1,2,2,3,2,3,1};

        System.out.println(c.containsDuplicate(num1));
        System.out.println(c.containsDuplicate(num2));
        System.out.println(c.containsDuplicate(num3));
    }
}
