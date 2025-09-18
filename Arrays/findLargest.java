package Arrays;

import java.util.Scanner;

public class findLargest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int size = sc.nextInt(); 
        int arr[] = new int[size];      //initalizing the array with size 

        //input the array elements
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt(); 
        }

        //Print the elements that you have inserted
        System.out.println("Array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();

        int largest=0;
        //Checking the operation
        for(int i=1; i<arr.length; i++){
            if(arr[0]>arr[i]){
                largest = arr[0];
            }else{
                largest= arr[i]; 
            }
        }

        System.out.println("The largest number is: "+largest);

        





    }
}
