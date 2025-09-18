import java.util.Scanner;

public class largestof3 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("The largest number is: "+num1);
        }
        else if (num2>num1 && num2>num3){
            System.out.println("The largest number is: "+num2);
        }
        else if(num3>num1 && num3>num1){
            System.out.println("The largest number is: "+num3);
        }
    }
}
