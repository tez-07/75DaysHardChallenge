package LEETCODE;

public class ReverseInt {
    
    public static void main(String[] args) {
        
        int x =120;
        System.out.println(reverse(x));
        
    }

    public static int reverse(int x) {
        
        int num=0;
        while(x!=0){
            int div = x % 10;
            num = num * 10 +div;
            x /= 10;
        }
        return num;
    }
}
