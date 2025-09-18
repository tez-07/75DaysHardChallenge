package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class csvReadFile {
    public static void main(String[] args) throws IOException {
        
        
        //Approach 1: Using Scanner Class
        String fileName = System.getProperty("user.dir")+"/Data/file1.csv";
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        sc.useDelimiter(",");

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
        
        //Approach2: Using java split method
        String fileName1 = System.getProperty("user.dir")+"/Data/file1.csv";
        FileReader reader = new FileReader(fileName1);

        BufferedReader bfReader = new BufferedReader(reader);
        String line;
        while ((line=bfReader.readLine()) != null) {
            String[] data = line.split(",");
            for(String value: data){
                System.out.print(value+"\t");
            }
            System.out.println();
        }

    }
}
