/*
            *******
            *     *
            *     *
            *     *
            *******
 */
package Patterns;

public class hollowRect {
    
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){
            for(int j=1; j<=7; j++){
                if(i==1 || j==1 || i==5 || j==7){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
