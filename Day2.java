//Reverse a string

package SeventyFiveHard;

public class Day2 {
    
    public static void main(String[] args) {
        
        String original = "Tez Borgohain";
        String reverse = "";

        char ch;

        //logic
        for(int i = original.length()-1; i>=0;i--){
            ch = original.charAt(i);                        //Method used to store one char at a time
            reverse = reverse + ch;
        }

        System.out.println("Reversed String: "+reverse);


        //Using StringBuilderMethod
        String originalStr = "JAVA";
        StringBuilder reversed = new StringBuilder(originalStr);
        reversed.reverse();
        System.out.println("ReversedString: "+reversed);
    }
}
