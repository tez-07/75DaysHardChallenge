//Armstrong Number
//is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
      
    /*
        num = 153
        1*1*1 =1
        5*5*5 = 125
        3*3*3 = 27

        sum = 1+ 125 + 27 = 153

        num = sum : Armstrong
    */


import java.util.Scanner;

public class armstrongNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;
        int rem; 
        int sum =0;

        //Calculating the no of digits
        while (temp!=0) {
            rem = temp % 10;        //last digit
            count ++;
            temp /= 10;
        }

        //Calculate each digit power
        while (temp!=0) {
            rem = temp % 10;
            sum += Math.pow(rem, count); 
            temp /=10;
        }

        if(temp==sum){
            System.out.println(number+ " :is an armstrong number");
        }else{
            System.out.println(number+ " is not an armstrong number");
        }

        
    }
}
