package Arrays;

import java.util.Scanner;

public class twoDbasic {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2D array:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr2[][] = new int[rows][cols];

        //intput
        for(int i=0; i<rows; i++){              //rows
            for(int j=0; j<cols; j++){         //cols
                arr2[i][j] = sc.nextInt();    
            }
        }


        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
