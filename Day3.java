// Check if a number is Prime
// It is greater than 1
// No number other than 1 and itself divides it evenly
// 1 2 3 5 7 11 13 17

package SeventyFiveHard;

import java.util.Scanner;

public class Day3 {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number: ");
        int number = sc.nextInt();

        int count=0;

        for(int i=1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.println("Number entered is prime number");
        }else{
            System.out.println("Number entered isn't prime number");
        }
    }
}
