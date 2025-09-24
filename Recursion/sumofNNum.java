package Recursion;

public class sumofNNum {
    
    public static void sumNum(int i, int n, int sum){
        if(i == n){
            sum = sum + i;
            System.out.println("Total sum is: "+sum);
            return;
        }
        sum = sum + i;
        sumNum(i+1, n, sum);
        System.out.println(i);
    }


    public static void main(String[] args) {

        sumNum(1, 5, 0);
    }
}
