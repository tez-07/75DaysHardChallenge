import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n){
        
        Set<Integer> set = new HashSet<>();
        while (n!=1) {
            int temp = n;
            int sum =0;
            while (temp>0) {
                int r = temp%10;            
                sum = sum + (int)Math.pow(r,2);
                temp = temp/10;
            }

            if(set.contains(sum)){
                return false;
            }

            set.add(sum);
            n = sum;
        }    
        return true;
        
    }
}
