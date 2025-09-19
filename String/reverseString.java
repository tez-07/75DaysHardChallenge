package String;

public class reverseString {

    public static void main(String[] args) {
        
        String str = "I will clear this interview!";

        //Using StringBuffer
        StringBuffer sbb = new StringBuffer(str);
        String revsbb = sbb.reverse().toString();
        System.out.println(revsbb);

        //Using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        String revStr = sb.reverse().toString();
        System.out.println(revStr);


        //Using charArray
        char arr[] = str.toCharArray();
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
        System.out.println();


        //Using charAt index
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.print(rev);
    }
    
}
