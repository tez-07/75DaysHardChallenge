package LEETCODE;

public class LinearSearch {
    
    public static int LinearSearch(int nums[], int search){

        for(int i=0; i<nums.length; i++){
            if(nums[i]==search){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int nums[] = {10,20,40,30};
        int search = 30;
        int i = LinearSearch(nums, search);

        if(i == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Position Found is: "+i);
        }
    }
}   
