public class RemoveElement27 {
    
    public int removeElement(int[] nums, int val) {
        
        int i=0;
        
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=val){
                nums[i] = nums[j]; 
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        
        int nums[] ={3,2,2,3};
        RemoveElement27 r = new RemoveElement27();
        int result = r.removeElement(nums, 3);
        System.out.println(result);
    }
}
