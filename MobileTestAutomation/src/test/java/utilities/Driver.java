package utilities;

import devices.DeviceFarm;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Driver {
    public static AppiumDriver driver;  //Class'a ozgu yani tum methodlar tek bir yerden kullanabilsin diye static
    DesiredCapabilities capabilities;
    String android;      // Android icin gerekli konfigurasyonun path'ini alacak.
    String ios;          // iOS icin gerekli konfigurasyonun path'ini alacak.

    public Driver() {
        android = DeviceFarm.ANDROID.getPath(); // Android variable'na DeviceFarm class'inda belirttigim ANDROID sabitinin path'i atandı.
        ios = DeviceFarm.IOS.getPath();         // iOS variable'na DeviceFarm class'inda belirttigim IOS sabitinin path'i atandı.
    }

    public AppiumDriver newSession() throws MalformedURLException {
        String platform = ConfigurationReader.get("platform"); //configuration.properties dosyasindan "platform" degerini alıp buradaki platform variable'na atama yapiyor.
        if (driver == null) {
            switch (platform.toLowerCase()) {  // switch yapisina config.properties'den aldigim degeri gonderip, testin hangi ortamda calisacagina karar veriyorum.
                case "android": {
                    capabilities = JsonConverter.jsonToObjectConverter(android); //JsonConverter classini kullanarak "android.json" dosyasini DesiredCapabilities objesine donusturdum.
                    capabilities.setCapability("appium:app", new File("src/test/resources/apps/rentfly.apk").getAbsolutePath()); // apk dosyasinin path'ini ekledim.
                    driver = new AndroidDriver(new URL("http://localhost:4723"), capabilities); // AndroidDriver baslatarak, driver degiskenine atadim.
                    break; // kodlar calistiktan sonra switch blogundan cikar.
                }
                case "ios": {
                    capabilities = JsonConverter.jsonToObjectConverter(ios);
                    capabilities.setCapability("appium:app", new File("src/test/resources/apps/rentfly.apk").getAbsolutePath());
                    driver = new IOSDriver(new URL("http://localhost:4723"), capabilities);
                }
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); //ana ekranin yuklenmesi icin global wait
        return driver;
    }

    public void closeDriver() {
        if (driver != null) { // Eger driver bos degilse
            driver.quit();    // Driver'i kapat
            driver = null;    // driver'i null'a esitle
        }
    }
}


















