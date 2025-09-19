package String;

public class removeDuplicates {
    public static void main(String[] args) {
        
        String str = "Aeroplane";
        char arr[] = str.toCharArray();
        int size = arr.length;
        String newStr = "";

        for(int i=0; i<size; i++){
            boolean repeated = false;
            for(int j=i+1; j<size; j++){
                if(arr[i]==arr[j]){
                    repeated = true;
                    break;
                }
            }
            if(repeated==false){
                newStr += arr[i];
            }
        }
        System.out.println(newStr);
    }
}
