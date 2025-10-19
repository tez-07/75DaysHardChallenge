package LEETCODE;

public class AddBinary {
    
    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        
        StringBuilder result = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry=0;
        
        while (i>=0 || j>=0 || carry!=0) {
            int ki = (i>=0) ? a.charAt(i)-'0' : 0;
            int kj = (j>=0) ? b.charAt(j)-'0' : 0;

            int sum = ki + kj + carry;
            result.append(sum%2);

            carry = sum/2;
            i--;
            j--;
        }

        return result.reverse().toString();
        
    }
}
