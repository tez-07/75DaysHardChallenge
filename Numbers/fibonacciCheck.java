//Fibonacci Series
//Each number = sum of the previous two numbers
// 1, 2, 3, 5, 8, 13, 21, 34

public class fibonacciCheck {
    
    public static void main(String[] args) {

        int number = 10;
        int sum =0;
        int num1=0;
        int num2=1;
        
        for(int i=1; i<number; i++){
            sum = num1+num2;
            System.out.print(sum+" ");
            num1 = num2;
            num2 =sum;
        }
        

        /*
        int num1 = 0;
        int num2 = 1;
 
        for(int i=0; i<number; i++){
            int sum = num1 + num2;
            System.out.print(num1+ ",");
            num1 = num2;
            num2 = sum;
        }
        */
    }
}
