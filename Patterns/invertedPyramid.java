package Patterns;

public class invertedPyramid {
    public static void main(String[] args) {
        
        
        //Using i<j concept ------------- Pattern is different
        /*
            ***** 
             ****
              ***
               ** 
                * 
         */
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(i<=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

        

        //Using n concept
        /*
                *****
                ****
                ***
                **
                * 
         */
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
