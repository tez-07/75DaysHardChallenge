import java.util.Scanner;

public class reverseNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int number = sc.nextInt();
        String str = String.valueOf(number);

        String reverse = "";

        for(int i=str.length()-1; i>=0;i--){
            char ch = str.charAt(i);
            reverse += ch;
        }

        System.out.println("Reverse Number is: "+reverse);
    }
}
