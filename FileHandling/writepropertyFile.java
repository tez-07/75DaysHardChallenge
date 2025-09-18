package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writepropertyFile {
    
    public static void main(String[] args) throws IOException {
        
        Properties properties = new Properties();
        properties.setProperty("Name", "Sunny");
        properties.setProperty("Email", "gohain13@gmail.com");
        properties.setProperty("Age", "18");

        String filePath = System.getProperty("user.dir")+"/Data/example.properties";

        FileOutputStream fs = new FileOutputStream(filePath);

        properties.store(fs, "Sample data in property file...");
        fs.close();
        
        System.out.println("Properties have been written into the property file.");

    }
}
