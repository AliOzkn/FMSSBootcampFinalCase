package utilities;

import com.google.gson.Gson;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class JsonConverter {

    public static DesiredCapabilities jsonToObjectConverter(String path) {

        /* Bu metodun amaci, bir JSON dosyasini DesiredCapabilities nesnesine donusturmektir. Adımlar şunlardır:
           Gson kütüphanesi ile JSON verisi Map<String, ?> türüne dönüştürülür.
           Bu Map ile , DesiredCapabilities sınıfından bir nesne olusturulur.
           JSON verilerini işleme sırasında bir hata oluşursa, hata konsola yazdırılır ve null döndürülür.
           Bu metodun çalışabilmesi için DesiredCapabilities sınıfının, bir Map'i parametre olarak kabul eden bir constructor'ı olması gerekir. Eğer bu yapı yoksa, kod çalışmayacaktır.*/


        Gson gson = new Gson();     // Gson, JSON verilerini Java nesnesine - Java nesnelerini JSON verilerine donusturmek icin kullanilir.

        try {
            String json = Files.readString(Paths.get(path));     /* readString() metodu, Files class'inin String deger tipi donduren static bir metodu. Ve bu method Path tipinde bir parametre aliyor.
                                                                    get() metodu, Paths class'inin Path deger tipi donduren static bir metodu.
                                                                    Yani "path" olarak tanimladigim dosya yolunu, get() metodu ile Path formatina donusturup, readString() metodunu kullanabilmesini sagliyorum.
                                                                    Ardindan bu veriyi json adini verdigim bir String'e atiyorum. */

            Map<String, ?> map = gson.fromJson(json, Map.class); /* fromJson() metodu, JSON verisini Java nesnesine donusturen method.
                                                                    Map.class ile  JSON verisinin Map nesnesine donusturulecegini belirtiyoruz.
                                                                    Yani  gson.fromJson(json, Map.class) ile JSON formatindaki "json"'ı alip Map<String, ?> tipine donusturuyor.  */

            return new DesiredCapabilities(map);                 // JSON, Map'e' donusturuldukten sonra, bu Map'i kullanarak yeni bir DesiredCapabilities nesnesi olusturuldu.

        } catch (IOException e) {
            System.out.println(e);
        }

        return null; // Hata durumunda null dondur.
    }

}