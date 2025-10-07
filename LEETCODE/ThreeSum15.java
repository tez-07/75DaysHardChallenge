package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public static void main(String[] args) {
        
        int arr[] = {-1,0,1,2,-1,-4};
        System.out.println(threesum(arr));
    }

    public static List<List<Integer>> threesum(int arr[]){

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length-2; i++){
            
            int left =i+1;
            int right = arr.length-1;
            
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }

            while(left<right){
                int sum = arr[i] +arr[left] + arr[right];

                if(sum ==0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));

                    while (left<right && arr[left]==arr[left+1]) {
                        left++;
                    }
                    while (left<right && arr[right]==arr[right-1]) {
                        right--;
                    }

                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else if(sum>0){
                    right--;
                }
            }
            



        }
        
        return result;
    }
}
