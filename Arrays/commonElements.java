package Arrays;

public class commonElements {
    
    public static int findcommonNum(int arr1[],int arr2[]){

        int len1 = arr1.length;
        int len2 = arr2.length;

        int commonElement=0;
        for(int i=0; i<len1; i++){
            for(int k=0; k<len2; k++){
                if(arr1[i]== arr2[k]){
                    commonElement = arr1[i];
                }
            }
        }
        System.out.println("Directly printing: "+commonElement);
        return commonElement;
    }
    
    public static void main(String[] args) {
        
        int arr1[] = {23,51,45,25,77};
        int arr2[] = {10,59,15,23,96};
        
        int com = findcommonNum(arr1, arr2);
        System.out.println("Calling the function with return command: "+com);

    }
}
