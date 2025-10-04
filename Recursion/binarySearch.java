public class binarySearch {
    
    public static void main(String[] args) {
        
        int arr[] = {3,5,2,6,3,6,8,4,9};
        int target = 6;
        
        int result = binary(arr, target, 0, arr.length);
        System.out.println(result);
    }

    static int binary(int arr[], int target, int start, int end){

        if(start>=end){
            return -1;
        }
        int mid = start + (end-start)/2;

        if(target==arr[mid]){
            return mid;
        }
        else if(target<=arr[mid]){
            return binary(arr, target, 0, mid);
        }
        else if(target>=arr[mid]){
            return binary(arr, target, mid+1, end);
        }

        return -1;
    }
}
