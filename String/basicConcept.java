package String;

public class basicConcept {
    
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        String str1 =  "Hez Corgohain";
        String str2 =  "Hez Sorgohain";

        String add = str1+str2;
        //String add1 = str1.concat(str2);

        System.out.println(add + " ");
        
        if(str.compareTo(str1)==0){
            System.out.println("Equals 2");
        }else{
            System.out.println("NOT");
        }
         */
        
        //Adding
        String str00 = "hellolio";
        str00 = str00+"i";
        System.out.println(str00); 

        //Removing
        String newStr = str00.substring(0, 3);
        System.out.println(newStr);

        //Removing from the middle
        String newStr1 = str00.substring(0, 3) + str00.substring(4, 9);
        System.out.println(newStr1);
    }   
}
