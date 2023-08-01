import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Hesap hesap1 = new Hesap("1234", 1000);
        Hesap hesap2 = new Hesap("4321", 15000);

        atm.hesapEkle(hesap1);
        atm.hesapEkle(hesap2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            menuGoster();

            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    bakiyeGoster(atm, scanner);
                    break;
                case 2:
                    paraYatir(atm, scanner);
                    break;
                case 3:
                    paraCek(atm, scanner);
                    break;
                case 4:
                    atm.hesaplariGoster();
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
            }
        }
    }

    private static void menuGoster() {
        System.out.println("\n1. Bakiye Görüntüle");
        System.out.println("2. Para Yatır");
        System.out.println("3. Para Çek");
        System.out.println("4. Tüm Hesapları Göster");
        System.out.println("5. Çıkış");
        System.out.print("Seçiminizi yapın (1-5): ");
    }

    private static void bakiyeGoster(ATM atm, Scanner scanner) {
        System.out.print("Hesap numaranızı girin: ");
        String hesapNo = scanner.next();
        atm.bakiyeGoster(hesapNo);
    }

    private static void paraYatir(ATM atm, Scanner scanner) {
        System.out.print("Hesap numaranızı girin: ");
        String hesapNo = scanner.next();
        System.out.print("Yatırılacak miktarı girin: ");
        int miktar = scanner.nextInt();
        atm.paraYatir(hesapNo, miktar);
    }

    private static void paraCek(ATM atm, Scanner scanner) {
        System.out.print("Hesap numaranızı girin: ");
        String hesapNo = scanner.next();
        System.out.print("Çekeceğiniz miktarı girin: ");
        int miktar = scanner.nextInt();
        atm.paraCek(hesapNo, miktar);
    }
}
