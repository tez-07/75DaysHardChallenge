package String;

public class removeWhiteSpaces {
    public static void main(String[] args) {
        
        String str = "Bor g h  ai n";
        String newStr= "";
        
        //Using loop with CharAt
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                newStr += ch;
            }
        }
        System.out.println(newStr);


        //Using replaceAll method: Need to escape the backslash, so it becomes double \\s (s:whitespace)
        String strTrim = str.replaceAll("\\s", "");     
        System.out.println(strTrim);
    }
}
