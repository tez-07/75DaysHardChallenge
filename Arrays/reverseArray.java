package Arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        
        int arr[] = {12, 43, 53, 64, 75, 83, 52};
        int revArr[] = new int[arr.length];

        int i, j;

        for(i=arr.length-1,  j=0;  i>=0;  i--, j++){
            revArr[j] = arr[i];
        }

        /*
                for ( init (i, j) ; condition ; update (i, j) )
         */

        System.out.println(Arrays.toString(revArr));
    }    
}
