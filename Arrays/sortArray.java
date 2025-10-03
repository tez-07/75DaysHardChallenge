package Arrays;

import java.util.Arrays;


public class sortArray {
    public static void main(String[] args) {
        
        int arr[] = {92,43,21,53,76};

        //Buit in Sorting
        Arrays.sort(arr);       // arr is now sorted; it is a behaviour doesn't return anything to be stored``
        System.out.println("BuiltIn Sort: "+Arrays.toString(arr));
        System.out.println();
        
        //Bubble Sort
        for(int i=0; i<arr.length-1; i++){       //largest will be pushed to the end, no need to check again 
                for(int j=0; j<arr.length- 1; j++){  //ensures the inner loop stops before reaching the sorted part. 
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
            }
        }
        System.out.print("Bubble Sort: "+Arrays.toString(arr));
        System.out.println();
        System.out.println();


        //Selection sort ---------------------- CRITICAL TO UNDERSTAND
        for(int i=0; i<arr.length-1; i++){
            int smallest =i;
            int temp =0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    smallest = j;
                }
            temp = arr[smallest];           //creating a variable where smallest can be stored intially
            arr[smallest] = arr[i];             //first place element moved to the smallest place element
            arr[i] = temp;                      //smallest value stored in 1st place
            }
        }
        System.out.print("Selection sort: "+Arrays.toString(arr));
        System.out.println();
        System.out.println();
   
        /*
        //Insertion Sort
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp=0;
                int ins = j-1;
                if(arr[j]>arr[i]){
                    ins = j;
                }
            }
        }
        */
    }
}
