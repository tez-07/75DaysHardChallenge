package Arrays;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        
        int arr1[] = {12, 43, 64, 43};
        int arr2[] = {45, 65, 77, 92};

        int arr3[] = new int[arr1.length + arr2.length];

        for(int i=0; i<arr1.length; i++){
            arr3[i] = arr1[i];                  //store: {12, 43, 64, 43}
        }

        for(int i=0; i<arr2.length; i++){
            arr3[i+arr1.length] = arr2[i];      //store: {12, 43, 64, 43, 45, 65, 77, 92}
        }

        System.out.print(Arrays.toString(arr3));
        






    }
}
