public class Hesap {
    private String hesapNo;
    private int bakiye;

    public Hesap(String hesapNo, int baslangicBakiye) {
        this.hesapNo = hesapNo;
        this.bakiye = baslangicBakiye;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void yatir(int amount) {
        bakiye += amount;
    }

    public boolean cek(int miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            return true;
        }
        return false;
    }
}
