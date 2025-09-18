package Arrays;

import java.util.ArrayList;

public class removeDup {


    static void removeDuplicateswithArraylist(int arr[]){
    
        int len = arr.length;
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i=0; i<len; i++){
            boolean isduplicate = false;
            int temp = arr[i];
            for(int j =i+1; j<len; j++){
                if(temp==arr[j]){
                    isduplicate = true;
                    break;
                }
            }
            if(!isduplicate){
                arrList.add(arr[i]);
            }
        }    
        
        System.out.print("Array without duplicates: " + arrList);
    }


    public static int removeDuplicates_withArray(int arr[]){

        int len = arr.length;
        int temp =0;

        for(int i=1; i<len; i++){
            if(arr[temp] != arr[i]){
                temp++;
                arr[temp] = arr[i];
            }
        }
        return temp+1;
    }


    public static void main(String[] args) {
        
        int arr[] = {1,45,3,22,22,45};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        //removeDuplicateswithArraylist(arr);
        int rm = removeDuplicates_withArray(arr);

        System.out.println();
        for(int i=0; i<rm; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
