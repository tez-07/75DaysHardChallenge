package FileHandling;

import java.io.File;

public class folderActions {
    
    //Create new folder
    public static void createFile(String folderPath){
        File folder = new File(folderPath);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("Folder created: "+folderPath);
        }
    }

    //Check folder exists
    public static boolean existFolder(String folderPath){
        File folder = new File(folderPath);
        return folder.exists();
    }

    //Rename a folder
    public static void renameFolder(String oldPath, String newPath){
        File oldFolder = new File(oldPath);
        File newFolder = new File(newPath);

        if(oldFolder.exists()){
            oldFolder.renameTo(newFolder);
            System.out.println("Renamed to: "+newPath);
        }
    }

    //Delete Folder
    public static void deleteFolder(String folderName){
        File folder = new File(folderName);
        if(folder.exists()){                            //Check if Folder exist

            for(File file: folder.listFiles()){         //Delete the files first 
                file.delete();
            }
            folder.delete();                            //Delete the folder

            System.out.println("Folder deleted: "+folderName);
        }

    }

    public static void main(String[] args) {
        
        //Creating Folder
        String folderPath = "/Users/tezborgohain/Desktop/Coding/TestingCreatedProjects/TestingFiles";
        createFile(folderPath);

        //Checking the existing folder
        boolean folderExist = existFolder(folderPath);
        System.out.println("Folder Exists: "+folderExist);
    
        //Renaming the folder
        String renamefolderPath = "/Users/tezborgohain/Desktop/Coding/TestingCreatedProjects/TestingFilesHandling";
        renameFolder(folderPath, renamefolderPath);

        deleteFolder(renamefolderPath);
    }    
}
