package Arrays;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //inputs
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // 12 43 53 22 32
        //Checking the condition
        int largest=0;
        int secondlargest=0;
        
        if(arr[0]>arr[1]){
            largest = arr[0];
            secondlargest = arr[1];        
        }else{
            largest = arr[1];                   //43
            secondlargest = arr[0];             //12
        }

        for(int i =2; i<arr.length; i++){
            if(arr[i]>largest){                 //53>43
                largest = arr[i];               //53
                secondlargest = largest;
            }                                   
                                                //if 34 line wasn't written             //Main
            else if(arr[i]>secondlargest){      //53>12                                 //53>43
                secondlargest = arr[i];         //53                                    //43
            } 
        }


    }
}
