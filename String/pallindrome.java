package String;

public class pallindrome {

    public static void main(String[] args) {
        
        String str = "Aeroorea";
        String newStr = str.toLowerCase();
        String revStr ="";

        for(int i=newStr.length()-1; i>=0; i--){
            char ch = newStr.charAt(i);
            revStr += ch;
        }

        if(newStr.equals(revStr)){
            System.out.println("Pallindrome: "+revStr );
        }else{
            System.out.println("Not a pallindrome: "+revStr);
        }
    }
    
}
