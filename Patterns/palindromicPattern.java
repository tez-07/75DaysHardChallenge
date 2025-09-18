/*
 
    1
   212
  32123
 4321234
543212345

 */

package Patterns;

public class palindromicPattern {
    public static void main(String[] args) {
        int rows = 5;

        for(int i=1; i<=rows; i++){

            //print spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }

            //print 1st half stars
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //print 2nd half
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

        System.out.println();
        }
    }
}
