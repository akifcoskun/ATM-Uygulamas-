import java.util.HashMap;
import java.util.Map;

public class ATM {
    private Map<String, Hesap> hesaplar;

    public ATM() {
        hesaplar = new HashMap<>();
    }

    public void hesapEkle(Hesap hesap) {
        hesaplar.put(hesap.getHesapNo(), hesap);
    }

    public Hesap getHesap(String hesapNo) {
        return hesaplar.get(hesapNo);
    }

    public void bakiyeGoster(String hesapNo) {
        Hesap hesap = getHesap(hesapNo);
        if (hesap != null) {
            System.out.println("Bakiyeniz: " + hesap.getBakiye() + " TL");
        } else {
            System.out.println("Hesap bulunamadı.");
        }
    }

    public void paraYatir(String hesapNo, int miktar) {
        Hesap hesap = getHesap(hesapNo);
        if (hesap != null) {
            hesap.yatir(miktar);
            System.out.println("Yatırma işlemi başarılı. Güncel bakiyeniz: " + hesap.getBakiye() + " TL");
        } else {
            System.out.println("Hesap bulunamadı.");
        }
    }

    public void paraCek(String hesapNo, int miktar) {
        Hesap hesap = getHesap(hesapNo);
        if (hesap != null) {
            if (hesap.cek(miktar)) {
                System.out.println("Para çekme işlemi başarılı. Güncel bakiyeniz: " + hesap.getBakiye() + " TL");
            } else {
                System.out.println("Yetersiz bakiye.");
            }
        } else {
            System.out.println("Hesap bulunamadı.");
        }
    }

    public void hesaplariGoster() {
        System.out.println("\nTüm Hesaplar:");
        for (Hesap hesap : hesaplar.values()) {
            System.out.println("Hesap: " + hesap.getHesapNo() + ", Bakiye: " + hesap.getBakiye() + " TL");
        }
    }
}
