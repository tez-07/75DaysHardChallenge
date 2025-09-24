package LEETCODE;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if(target==sum){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String args[]){
        
        int nums[] = {2,7,11,15};
        TwoSum s = new TwoSum();
        int arr[] = s.twoSum(nums, 13);

        System.out.println("The indexes are: "+arr[0]+","+arr[1]);
    }
}