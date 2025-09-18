package String;

public class reverseString {

    public static void main(String[] args) {
        
        String str = "Hey, I hope I get the job!";

        StringBuilder sb = new StringBuilder(str);
        String revStr = sb.reverse().toString();

        System.out.println(revStr);
    }
    
}
