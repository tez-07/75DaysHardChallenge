//180 degree rotated
/*
        * 
       ** 
      *** 
     **** 
 */

package Patterns;

public class halfPyramidInverted {
    
    public static void main(String[] args) {
        int n=4;

        for(int i=1; i<=n; i++){

            //creating spaces
            for(int s=0; s<=n-i; s++){
                System.out.print(" ");
            }

            //creating stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
