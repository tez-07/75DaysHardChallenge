/*
                *****
               *****
              *****
             *****
            *****
 */

package Patterns;

public class rombhus {
    public static void main(String[] args) {
        
        int rows= 5;

        for(int i=1; i<=5; i++){

            //print spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }

            //print stars
            for(int j=1; j<=rows; j++){
                System.out.print("*");
            }
        
        System.out.println();
        }
    }
}
