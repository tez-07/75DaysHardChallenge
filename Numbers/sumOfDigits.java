import java.util.Scanner;

public class sumOfDigits {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        
        
        while (num!=0) {
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        
        /*int temp = num;

        while (temp!=0){
            int digit = temp % 10;         //get last digit
            sum += digit;                  //add to the sum
            temp = temp/10;
        }
        */
        System.out.println("Sum of digits are: "+sum);
    }
}
