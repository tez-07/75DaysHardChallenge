package String;

public class countNumWords {
    public static void main(String[] args) {
        
        String str = "Hey I    want a job really bad and I am working hard for it.";

        //Proper approach using trim and split
        //trim: removes first and last spaces
        //split: removes the whitespaces 
        String newStr[] = str.trim().split("\\s");
        int wordscount = newStr.length;
        System.out.println(wordscount);




        
        //Not a proper approach; will fail where there are two whitespaces
        int count =1;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isSpaceChar(ch)){
                count++;
            }
        }
        System.out.println("Total number of words in the string is: "+count);
    }
}
