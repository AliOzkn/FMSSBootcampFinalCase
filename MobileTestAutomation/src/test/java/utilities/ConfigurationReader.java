package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {

        try {
            String path = "src/test/resources/properties/configuration.properties"; // configuration.properties dosyasinin konumu.
            FileInputStream input = new FileInputStream(path);  // configuration.properties dosyasini okuma islemi.
            properties = new Properties();  // Properties class'indan nesne olusturdum.
            properties.load(input); // Olusturdugum nesneye az once okudugum configuration.properties dosyasi verilerini yukledim.
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String get(String keyName) {
        return properties.getProperty(keyName);  // configuration.properties dosyasi key - value formatinda oldugu icin istenilen key degerini almak icin parametreye keyName adini verdim
                                                 // Properties classinin getProperty metodu, belirtilen key'in degerini dondurecek.
    }
}
