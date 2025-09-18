package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class readpropertyFile {
    public static void main(String[] args) throws IOException {
        
        Properties properties = new Properties();
        String filePath = System.getProperty("user.dir")+"/Data/example.properties";

        FileInputStream fs = new FileInputStream(filePath);
        
        properties.load(fs);
        fs.close();

        //Read data from properties file
        String Name = properties.getProperty("Name");
        String Age = properties.getProperty("Age");
        String Email = properties.getProperty("Email");

        System.out.println(Name+" "+Age+" "+Email);

        //get all string properties using set
        Set<String> keys = properties.stringPropertyNames();
        System.out.println(keys);

        //Using object
        Collection<Object> key = properties.keySet();
        System.out.println(key);

        //get all values using object  
        Collection<Object> values =  properties.values();
        System.out.println(values);

        //Read using key and values using loop
        for(String key1: properties.stringPropertyNames()){
            System.out.println(key1+ ":"+properties.getProperty(key1));
        }
    }
}
