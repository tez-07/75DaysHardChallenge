//Sum of arrays

package SeventyFiveHard;

public class Day6 {
    
    public static void main(String[] args) {
        
        int arr[] = {4,3,8,9,3,5};
        int sum =0;

        for(int i=0; i<arr.length;i++){
            sum = arr[i] + sum;
        }

        System.out.println("Sum of array: "+sum);

    }
}
