public class factorialCheck {
    
    public static void main(String[] args) {
        
        int number=5;
        int factorial = 1;

        for(int i=1;i<=number;i++){
            factorial *= i;                 //1*1   
        }

        System.out.println("Factorial of "+number+" is :"+factorial);
    }
}
