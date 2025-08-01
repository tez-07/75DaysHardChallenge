//Find Largest Number in an Array

package SeventyFiveHard;

public class Day4 {
    
    public static void main(String args[]){

        int arr[] ={3,44,5,7,2,64,34};
        int largest = arr[0];

        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>largest){
              largest=arr[i];  
            }
        }

        System.out.println("Largest number is: "+largest);
    }
}
