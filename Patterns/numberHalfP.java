/*
            1234
            123
            12
            1
 */
package Patterns;

public class numberHalfP {
   public static void main(String[] args) {
        int n = 4;

        for(int i=1; i<=n; i++){    
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
   }
}
