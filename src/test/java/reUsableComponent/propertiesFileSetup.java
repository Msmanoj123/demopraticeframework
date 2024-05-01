package reUsableComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesFileSetup {
    public static Properties propertiesFile() throws IOException {
        FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\java\\preRequisitesFiles.properties"));
        Properties prop = new Properties();
        prop.load(fis);
        return prop;
    }
}
