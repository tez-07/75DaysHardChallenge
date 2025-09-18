package Arrays;

import java.util.Scanner;

public class basic {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];


        //Input
        for(int j =0; j<arr.length; j++){
            arr[j] = sc.nextInt();
        }

        //Output
        for(int i=0;i<arr.length; i++){
            System.out.println("Values of array are: "+arr[i]);
        }



    }
}
