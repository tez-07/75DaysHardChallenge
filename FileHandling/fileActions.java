package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileActions {
    
    //Creating new file
    public static void createFile(String fileName){

        File file = new File(fileName);
        try{
            if(file.createNewFile()){
                System.out.println("File created: "+file.getName());        //getName: return text.file (name)
            }else{
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    //Writing into the file
    public static void writeFile(String fileName){

        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("Hello Worl! This is my first write statement!");    
            System.out.println("Successfully written.");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error Occured!");
            e.printStackTrace();
        }
        
    }

    //Reading file 
    public static void readFile(String fileName){

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }    

            myReader.close();
        } catch (Exception e) {
            System.out.println("An Error occured while reading");
            e.printStackTrace();
        }
        
    }

    //Rename File
    public static void renameFile(String oldpath, String newpath){

        File file1 = new File(oldpath);
        File file2 = new File(newpath);

        if(file1.renameTo(file2)){
            System.out.println("File is renamed: "+file2.getName());
        }else{
            System.out.println("File can't be renamed");
        }
    }
    
    //Delete file
    public static void deleteFile(String fileName){
        
        File file = new File(fileName);
        if(file.delete()){
            System.out.println("File is deleted successfully");
        }else{
            System.out.println("Failed to delete the file. Sorry!");
        }
    }

    public static void main(String[] args) {
        
        String filePath = "/Users/tezborgohain/Desktop/Coding/TestingCreatedProjects/TestingFilesHandling/txt1";
        String newPath = "/Users/tezborgohain/Desktop/Coding/TestingCreatedProjects/TestingFilesHandling/txt_new1";
        createFile(filePath);
        writeFile(filePath);
        readFile(filePath);
        renameFile(filePath, newPath);
        deleteFile(newPath);
    }
}
