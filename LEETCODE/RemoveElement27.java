import java.util.HashSet;
import java.util.Set;

public class RemoveElement27 {
    
    public int removeElement(int[] nums, int val) {
        
        /*
        int i=0;
        
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=val){
                nums[i] = nums[j]; 
                i++;
            }
        }
         */

        Set<Integer> set = new HashSet<>();
        int j=0;
        for(int i=j+1; i<nums.length; i++){
            if(nums[j]!=nums[i]){
                set.add(nums[j]);
                j=i;
            }
        }
        int size = set.size();
        System.out.println(set);
        return size;
    }

    public static void main(String[] args) {
        
        int nums[] ={3,2,2,3};
        RemoveElement27 r = new RemoveElement27();
        int result = r.removeElement(nums, 3);
        System.out.println(result);
    }
}
