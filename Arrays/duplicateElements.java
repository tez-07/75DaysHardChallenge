package Arrays;

import java.util.ArrayList;

public class duplicateElements {
    public static void main(String[] args) {
        
        int arr[] = {23, 54, 22, 23};
        int len = arr.length;

        int count=0;
        ArrayList<Integer> duplicates = new ArrayList<>();  

        for(int i=0; i<len ; i++){
            for(int j= i+1; j<len; j ++){
                if(arr[i]==arr[j]){
                    duplicates.add(arr[i]);
                    count++;
                }
            }
        }
        System.out.println("Duplicate elements are:"+duplicates);
        System.out.println("Total number of duplicate elements are: "+count);





    }
}
