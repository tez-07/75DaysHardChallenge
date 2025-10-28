package Arrays;

public class mergeSort {
    
    private void divide(int arr[], int start, int end){

        int mid = start + (end - start)/2;

        if(start >= end){
            return;
        }

        divide(arr,start, mid);         //left side recursion
        divide(arr, mid+1, end);        //right side recursion
        conquer(arr,start,mid,end);     //call it
    }

    private void conquer(int arr[], int start, int mid, int end){

        int merge[] = new int[end - start +1];      //length +1 = arr length, because always starts from 0, and s=0

        int idx1 = start;
        int idx2 = mid+1;
        int x =0;

        while(idx1<=mid && idx2<=end){
            if(arr[idx1] <= arr[idx2]){
                //we can write: merge[x++] = arr[idx1++], then we can skip line 29 and 30
                
                merge[x] = arr[idx1];
                x++;
                idx1++; 
            }else{
                merge[x] = arr[idx2];
                x++;
                idx2++;
            }
        }


        //If there is any leftover values after one of the array is sorted, one of the below loops
        // can handle this.
        while (idx1<=mid) {
            merge[x++] = arr[idx1++];
        }
        while (idx2<=end) {
            merge[x++] = arr[idx2++];
        }

    
        for(int i=0, j=start; i<merge.length; i++, j++){
            arr[j] = merge[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 2, 0, 0};
        int size = arr.length;

        mergeSort s = new mergeSort();
        s.divide(arr, 0, size-1);

        //print elements
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
