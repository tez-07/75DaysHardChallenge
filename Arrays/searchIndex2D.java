package Arrays;

import java.util.Scanner;

public class searchIndex2D {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        //Input the values in the array
        for(int i=0; i<rows; i++){              //rows
            for(int j=0; j<cols; j++){         //cols
                arr[i][j] = sc.nextInt();    
            }
        }

        //Output
        for(int i=0; i<rows; i++){
            for(int j =0;j<cols; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }      

        System.out.println("Enter the index of the value you want to find: ");
        int x = sc.nextInt();

        //Searching the index
        for(int i=0; i<rows; i++){
            for(int j =0;j<cols; j++){
                if(arr[i][j]==x){
                    System.out.println("Index of the value is: "+i+" "+j);       
                }
            }
        }        


    }
    
}
