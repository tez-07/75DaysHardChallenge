public class MaxProductSubarray {
    
    public static void main(String[] args) {
        
        int nums[] = {2,3,-2,4};

        int res = Integer.MIN_VALUE;

        for(int i: nums){
            res = Math.max(i, res);
            System.out.println(res);
        }

        int currMax =1;
        int currMin =1;

        for(int i: nums){
            int product = currMax *1;
            
        }
    }
}
