package LEETCODE;

public class BuySellStock121 {
    public int MaxProfit(int[] prices) {
        
        int smallest;
        int largest;
        int maxProfit=0;

        for(int i=0; i<prices.length-1; i++){
            if(prices[i]<prices[i+1]){
                smallest = prices[i];
                return i;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        
        int arr1[] = {7,1,5,3,6,4};
        int arr2[] = {7,6,4,3,1};

        BuySellStock121 s = new BuySellStock121();
        int result1 = s.MaxProfit(arr1);
        int result2 = s.MaxProfit(arr2);

        System.out.println(result1);
        System.out.println(result2);

    }
}
