package String;

import java.util.ArrayList;

public class longestWord {
    public static void main(String[] args) {
        
        String sentence = "Comm'n, I will complete this question!";
        sentence = sentence.replaceAll("[^a-zA-Z0-9\\s]", "");
        
        //Using split technique to segregate the words. Each word stored in an index 
        String arr[] = sentence.trim().split("\\s");
        
        ArrayList<String> list = new ArrayList<>();

        int longestWordLength =0;
        int maxlength =0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].length()>maxlength){
                maxlength = arr[i].length();
                list.clear();
                list.add(arr[i]);
                longestWordLength = maxlength; 
            }else if(arr[i].length()==maxlength){
                list.add(arr[i]);
            }
        }
        System.out.println("Longest word in the sentences is: "+list);
        System.out.println("Longest word size: "+longestWordLength);
        


        


    }
}
