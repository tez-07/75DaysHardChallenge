package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class csvWriteFile {
    public static void main(String[] args) throws IOException {
        
        String csvFileName = System.getProperty("user.dir")+"/Data/file1.csv";

        FileWriter writer = new FileWriter(csvFileName);
        writer.append("Name, Email, Age \n");
        writer.append("John, 30, john122@gmail.com \n");
        writer.append("Hui, 20, huijoh2@gmail.com \n");
        writer.append("Joe, 43, jo67n@gmail.com \n");
        writer.append("Johnny, 23, johny@gmail.com \n");

        writer.close();

        System.out.println("Csv file created successfuly"+csvFileName);
    }
}
