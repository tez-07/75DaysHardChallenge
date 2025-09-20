package String;

import java.util.Arrays;

public class anagrams {
    
    //Same letters different order
    // silent -- listen
    public static void main(String[] args) {
        
        String str1 = "silent";
        String str2 = "listen";

        char arr1[] = str1.toCharArray();
        for(int i=0; i<arr1.length; i++){
            char temp = 0;
            for(int j=i+1; j<arr1.length; j++){
                if(arr1[i]>arr1[j]){
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        char arr2[] = str2.toCharArray();
        for(int i=0; i<arr2.length; i++){
            char temp = 0;
            for(int j=i+1; j<arr2.length; j++){
                if(arr2[i]>arr2[j]){
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        System.out.println(arr1);
        System.out.println(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }
         
    }
}
