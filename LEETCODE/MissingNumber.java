import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    
    public static void main(String[] args) {
        int nums[] = {0,1,3};
        System.out.println(MissNumber(nums));
    }

    static int MissNumber(int nums[]){

        int size = nums.length;
        Set<Integer> set = new HashSet<>();
        
        for(int n: nums){
            set.add(n);
        }

        for(int i=0; i<size; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;
        
    }
}
