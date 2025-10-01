package LEETCODE;
/*
 *  If we used nested loops here, then time complexity = O(n^2)
 *  While loops - O(n)
 *  Question is asked to start the indexes from 1. 
 *  So , we had to do, left+1 and right +1 in the return statement.
 */


public class TwoPointers {
    public int[] twoSum(int[] numbers, int target) {
        
        int left =0;
        int right =numbers.length-1;
        
        while(left<right) {
            int sum = numbers[left]+ numbers[right];

            if(sum == target){
                return new int[] {left+1, right+1};
            }
            else if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }
        }
        
        return new int[] {-1,-1};
    }

    public static void main(String args[]){
        
        int nums[] = {2,7,11,15};
        TwoPointers s = new TwoPointers();
        int arr[] = s.twoSum(nums, 13);

        System.out.println("The indexes are: "+arr[0]+","+arr[1]);
    }
}
