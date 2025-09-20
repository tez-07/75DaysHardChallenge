package String;

public class countNumWords {
    public static void main(String[] args) {
        
        //Storing in array, spliting it then counting the length
        String str = "Hey I am the     best. ";
        String newStr[] = str.trim().split("\\s+");     //\\s - one whitespace \\s+ : more >1
        int wordscount = newStr.length;
        System.out.println(wordscount);
        

        //Counting number of characters only 
        //convert string to arr and use isLetter in loop to check char
        String str1 = "Hey I am the best";
        int totalchar =0;
        char arr[] = str1.toCharArray();
        for(char ch: arr){
            if(Character.isLetter(ch)){
                totalchar++;
            }
        }
        System.out.println("Total Characters: "+totalchar);



        //Counting number of words
        String str2 = "Hey I am the best";
        int words=0;
        for(int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            if(Character.isWhitespace(ch)){
                words++;
            }
        }
        System.out.println("Total Words: "+words);
        
    }
}
