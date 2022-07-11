package 集合;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args)  {

        FileInputStream fis = null;
        try {
            Properties properties = new Properties();

            fis = new FileInputStream("jdbc2.properties");

            properties.load(fis);

            String name = properties.getProperty("name");
            String password = properties.getProperty("password");
            System.out.println("name = " + name + ", password = " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!= null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
