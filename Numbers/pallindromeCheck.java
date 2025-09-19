//Pallindrome:
// if a string is reversed its the same.

public class pallindromeCheck {
 
    public static void main(String[] args) {
        
        /*
        String str = "HellolleH";
        String revString= "";

        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            revString += ch;
        }

        if(str.equals(revString)){
            System.out.println("The string is pallindrome:"+revString);
        }else{
            System.out.println("The string is not a pallindrome");
        }

        */

        //Approach : Integer is converted to string and compared.
        int num1 = 123211;
        String strOrg = String.valueOf(num1);
        int temp = num1;

        String revStr = "";
        while (temp!=0) {
            int digit = temp % 10;
            revStr = revStr + digit;
            temp = temp/10;
        }
        if(strOrg.equals(revStr)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }


    }
}


/*

== checks if two references point to the same object in memory, not whether their content is the same.
.equals() checks if the content of the objects is the same.

 */