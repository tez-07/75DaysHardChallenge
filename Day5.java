//Find Second Largest Number

package SeventyFiveHard;

public class Day5{

    public static void main(String args[]){

        int arr[] = {34, 58, 76,48,30};

        int max1 = 0;
        int max2 = 0;

        if(arr[0]>arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }else{
            max1 = arr[1];
            max2 = arr[0];
        }

        for(int i=2;i<arr.length-1;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2){
                max2 = arr[i];
            }
        }

        System.out.println("Largest: "+max1);
        System.out.println("SecondLargest: "+max2);
    }
}