package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        
        /*
        System.out.println("Enter the number in the array: ");
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int arr1[] = new int[size];
        */

        ArrayList<Integer> list = new ArrayList<>();

        //Largest array
        int arr[] = {12, 43, 62, 22, 53};
        int temp =0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            list.add(arr[i]);
        }


        int secondLargest = arr[arr.length-2];
        int secondLargestList = list.get(list.size()-2);
        int smallest = list.get(0); 

        System.out.println(arr[0]);                                             //arr already sorted
        System.out.println("largest element is: "+temp);
        System.out.println("Second largest element: "+secondLargest);
        System.out.println("SecondLarg using arraylist: "+secondLargestList);   
        System.out.println("Smallest Element: "+smallest);                      //stored in arraylist index

        

        //Approach 2:
        int a[] = {1,4,2,6,3,6,4,10};

        int largest=0; 
        for(int i=1; i<a.length; i++){
            if(a[0]>a[i]){
                largest = a[0];
            }else{
                largest = a[i];
            }
        }
        System.out.println("Largest is regular loop: "+largest);



        //Reverse an array
        int b[] = {1,4,2,6,3,6,4,10};
        int nb[] = new int[b.length];

        for(int i=b.length-1, j=0; i>=0; i--,j++){
            nb[j] += b[i];
        }
        System.out.println(Arrays.toString(nb));


    }
}
