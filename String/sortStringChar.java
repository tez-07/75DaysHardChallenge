package String;

import java.util.Arrays;

public class sortStringChar {
    public static void main(String[] args) {
        
        String str = "Pallindrome";


        //Approach 1 - Using loop and creating charArr
        char arr[] = str.toCharArray();
        int len = arr.length;
        char temp;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr[i]>arr[j]){          
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);        //Padeillmnor : P Uppercase so, at first place.
        


        //Approach 2: sort method used
        String str1 = "Apple";
        char arr1[] = str1.toCharArray();
        Arrays.sort(arr1);
        System.out.println(arr1);

    }
}
