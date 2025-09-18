package Arrays;

import java.util.Scanner;

public class searchIndex {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //Input the values in the array
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index of the value you want to find: ");
        int x = sc.nextInt();

        //Searching the index
        for(int j=0; j<arr.length; j++){
            if(arr[j]==x){
                System.out.println("Index is : "+j);
                break;
            }
        }

    }
    
}
