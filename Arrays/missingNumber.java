package Arrays;

public class missingNumber {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,5,6};
        int len = arr.length;

        int sum1=0;
        int sum2=0;
        
        for(int i=0; i<len; i++){
            sum1 += arr[i];                 
        }
        System.out.println("Total sum1: "+sum1);
  
        for(int i=1; i<=5; i++){
            sum2 += i;
        }
        System.out.println("Total sum2: "+sum2);

        System.out.println("Number missing is: "+(sum1-sum2));
    }
    
}
