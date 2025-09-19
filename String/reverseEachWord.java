package String;

public class reverseEachWord {
    public static void main(String[] args) {
        
        String str = "Hello World!";
        String arr[] = str.split(" ");

        String output = "";
        
        for(String s : arr){
            String reveString="";
            for(int i=s.length()-1; i>=0; i--){
                reveString = reveString + s.charAt(i);
            }
            output = output + reveString + " "; 
        }

        System.out.print(output);
    }
}
