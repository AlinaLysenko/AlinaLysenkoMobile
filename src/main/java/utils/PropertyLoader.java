package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {

    private static Properties properties = new Properties();

    static {
        try (InputStream is = PropertyLoader.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private PropertyLoader() {

    }

    public static String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
