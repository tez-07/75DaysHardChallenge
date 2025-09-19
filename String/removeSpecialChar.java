package String;

public class removeSpecialChar {
    public static void main(String[] args) {
        
        String str = "ts@78*gm^&ail.c)om";
        String newStr = "";


        //Using charAt
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                newStr = newStr + ch;
            }
        }
        System.out.println(newStr);


        //Simple : use replaceALl
        String strNew = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(strNew);
    }
}
