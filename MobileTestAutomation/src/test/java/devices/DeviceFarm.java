package devices;

import lombok.Getter;

@Getter
public enum DeviceFarm { /* Enum, önceden tanımlanmış sabit değerleri ifade etmede kullanılır.
                            Enum için yapıcı metot tanımlandığında private erişim belirleyici kullanılması zorunludur.
                            Aksi durumda derleme hatası alınır. */

    ANDROID("src/test/java/capabilities/android.json"),
    IOS("src/test/java/capabilities/ios.json");

    private final String path;  // Bu, DeviceFarm enumundaki her sabit icin path adında farkli bir değer saklar.

    DeviceFarm(String path) {   // DeviceFarm enumundaki her sabit için path özelliğini başlatmak amaciyla bu construstor'i olusturdum.
        this.path = path;      // Bu method this.path parametresini alacak ve bu parametreyi path özelliğine atayacak.
    }
}
