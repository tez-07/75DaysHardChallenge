package String;

public class basicStringBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello World!");
        sb.append("This is added");            //concate
        sb.insert(0,"Hey");             //insert
        sb.delete(0, 3);                 //delete
        sb.deleteCharAt(5);                  //delete char
        sb.replace(0, 5, "Hi ");     //replace
        sb.setLength(9);                 //size
        System.out.println(sb);
        
    }
}
