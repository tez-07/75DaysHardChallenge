package Patterns;

public class butterflyPattern {
    public static void main(String[] args) {
        
        int rows=5;

        //Upper half
        for(int i=1; i<=rows; i++){

            //1st half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }

            //2nd half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }


        //below half
        for(int i=rows; i>=1; i--){

            //1st half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }

            //2nd half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    
}
