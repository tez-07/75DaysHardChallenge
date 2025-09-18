package Patterns;

public class diamondPattern {
    public static void main(String[] args) {
        
        int rows=5;

        //Upper Half
        for(int i=1; i<=rows; i++){

            //print spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }

            //print 1st half stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
        System.out.println();
        }

        //Lower Half
        for(int i=rows; i>=1; i--){

            //print spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }

            //print 1st half stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    
}
