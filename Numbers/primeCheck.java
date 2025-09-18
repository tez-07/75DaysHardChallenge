//Prime Numbers: can't have more the 2 divisor. 
// 1 and 2 are already prime numbers.

import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int count=0;

        if(num<=1){
            System.out.println("Number is Not Prime: "+num);  
        }else{
            if(num>2){    
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count ++;
                }
            }  
        }

        if(count>2){
            System.out.println("Number is Not Prime: "+num);
        }else{
            System.out.println("Number is Prime");        
        }
    }
}}


