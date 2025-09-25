package LEETCODE;

public class BinarySearch {
 
    public static void main(String[] args) {

        int nums[] = {10,20,30,40,50,60,70};
        int search = 60;

        int lowerBound = 0;
        int higherBound = nums.length-1;
        boolean flag = true;

        while(lowerBound<=higherBound){
        int midValue = (lowerBound + higherBound)/2;
            if(search==nums[midValue]){
                System.out.println("Element is found in index: "+midValue);
                flag = true;
                break;
            }
            else if(search>nums[midValue]){
                lowerBound = midValue+1;
            }
            else if(search<nums[midValue]){
                higherBound = midValue-1;
            }
        }
        if(!flag){
            System.out.println("Element not found");
        }
    }
}
