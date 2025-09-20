package String;

public class nonRepeatedChar {
    public static void main(String[] args) {

        String str = "Java Programming";
        char arr[] = str.toCharArray();
        String newStr = "";

        for(int i=0; i<arr.length; i++){
            char ch = str.charAt(i);
            boolean isdupe = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    isdupe = true;
                    break;  
                }
            }
            if(!isdupe){
                newStr = newStr + arr[i];
            }
        }
        System.out.println(newStr);
    }
}
