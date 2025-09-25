package LEETCODE;
/*
 Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */

import java.util.Arrays;

public class Array66 {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else if(digits[i]==9){
                digits[i] =0;
            }
            //loop wil continue and check if the n-1 meets the first condition
        }
        
        //this is the case if the array is 9,9,9 
        //will come out of the loop and increase the array length
        //add a 1 to the first place
        //and already remaining digits are set to be 0, line 10
        if(digits[0]==0){
            int newdigits[] = new int[digits.length+1];
            newdigits[0] = 1;
            return newdigits;
        }

        return digits;
    }

    public static void main(String args[]){

        int digits[] = {1,2,3};
        Array66 s = new Array66();
        int newArr[] = s.plusOne(digits);
        System.out.println("The array represents the integer: "+Arrays.toString(newArr));
    }
}    
